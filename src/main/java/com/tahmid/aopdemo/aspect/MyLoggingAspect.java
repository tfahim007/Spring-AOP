package com.tahmid.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Aspect
@Component
public class MyLoggingAspect {
    @Pointcut("execution(* com.tahmid.aopdemo.dao.*.*(..))")
    private void  forDaoPackage(){};

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("================= EXECUTING @BEFORE ADVICE ON addACCOUNT==========");
    }

    @Before("forDaoPackage()")
    public void performAPIAnalytics(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println("================= EXECUTING FANVY APIS=========");
    }


}
