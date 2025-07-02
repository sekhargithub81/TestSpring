package com.ibm.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging execution of service and repository components.
 * 
 * This aspect provides logging for method entry, exit, exceptions, and execution time.
 */
@Aspect
@Component
public class LoggingAspect {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
     * Logs the return value of a method after it executes.
     *
     * @param joinPoint provides the context of the method call
     * @param retVal the returned value of the method
     */
	@AfterReturning(pointcut = "execution(* com.ibm..*(..)) && !within(com.ibm.correlation..*)", returning = "retVal")
	public void logAfterMethod(JoinPoint joinPoint, Object retVal) {
                if(retVal != null) {
                        log.info("returing {}" , retVal.getClass());
                        log.debug("-----------returning-- {}" , retVal);
                }
	}

	/**
     * Logs before a method executes.
     *
     * @param joinPoint provides the context of the method call
     */
	@Before("execution(* com.ibm..*(..)) && !within(com.ibm.correlation..*)")
	public void logBeforeMethod(JoinPoint joinPoint) {
		log.info("***  Entering in Method : {} Of {}" ,joinPoint.getSignature().getName(),joinPoint.getTarget().getClass().getName());
	}

	/**
     * Logs after a method executes.
     *
     * @param joinPoint provides the context of the method call
     */
	@After("execution(* com.ibm..*(..)) && !within(com.ibm.correlation..*)")
	public void logAfterMethod(JoinPoint joinPoint) {

		log.info("***  Exiting from  : {} Of {}" ,joinPoint.getSignature().getName(),joinPoint.getTarget().getClass().getName());
	}

	/**
     * Logs when a method throws an exception.
     *
     * @param joinPoint provides the context of the method call
     * @param e the thrown exception
     */
	@AfterThrowing(pointcut = "execution(* com.ibm..*(..)) && !within(com.ibm.correlation..*)", throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
		log.error("An exception has been thrown in {}" , joinPoint.getSignature().getName() + "()");
		log.error("Cause : %s" , e.getCause());
	}

	/**
     * Profiles a method execution time.
     *
     * @param pjp the proceeding join point to continue the execution of the method
     * @return the result of the method execution
     * @throws Throwable if an error occurs during method execution
     */
	@Around("execution(* com.ibm..*(..)) && !within(com.ibm.correlation..*)")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable { //NOSONAR
		try {
			long start = System.currentTimeMillis();

			Object output = pjp.proceed();

			Long elapsedTime = System.currentTimeMillis() - start;
			MDC.put("API", pjp.getSignature().toLongString());
			MDC.put("executionTime", String.valueOf(elapsedTime));
			log.info("Method execution time for API {} : {} milliseconds." , pjp.getSignature() ,elapsedTime);			
			return output;
		} finally {
			MDC.clear();
		}
	}
}
