package com.tahmid.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Aspect
@Component
public class MyLoggingAspect {
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("================= EXECUTING @BEFORE ADVICE ON addACCOUNT==========");
    }
}
