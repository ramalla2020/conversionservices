package com.conversion.service.config;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConversionDurationAspect {

	Logger logger = LoggerFactory.getLogger(ConversionDurationAspect.class);
	
	@Pointcut("execution(* za.co.playsafe.conversions.service.ConversionService.*(..))")
	private void logtime(){
		
	}
	
    @Around("logtime()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();

        final Object proceed = joinPoint.proceed();

        final long executionTime = System.currentTimeMillis() - start;

        logger.info("{} executed in {} ms", joinPoint.getSignature(), executionTime);

        return proceed;
    }

}