package com.tahmid.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
    public void performAPIAnalytics(){
        System.out.println("================= EXECUTING FANVY APIS=========");
    }
}
