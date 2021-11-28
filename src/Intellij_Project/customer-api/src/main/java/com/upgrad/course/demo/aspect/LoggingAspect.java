package com.upgrad.course.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Around("execution(* com.upgrad.course.demo..*(..))")
    public Object applyLogging(ProceedingJoinPoint jointPoint)throws Throwable{
        MethodSignature signature=(MethodSignature) jointPoint.getSignature();
        String className=signature.getDeclaringType().getSimpleName();
        String methodName=signature.getName();
        System.out.println("In"+className+"entering"+methodName);
        Object result=jointPoint.proceed();
        System.out.println("In"+className+"entering"+methodName);
        return result;
    }


}
