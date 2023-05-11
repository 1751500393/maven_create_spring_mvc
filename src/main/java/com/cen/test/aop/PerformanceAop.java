package com.cen.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Aspect
public class PerformanceAop {
    @Pointcut("execution(* com.cen.test.service.*.*(..))")
//    @Pointcut("@annotation(com.cen.test.annotation.AopAnnotation)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("2、前置条件");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("4、正常返回通知");
    }

    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void afterThrow(Exception ex) {
        System.out.println("4、" + ex.getMessage());
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("1、环绕前通知");
        Object proceed = pjp.proceed();
        System.out.println("6、环绕后通知");
        return proceed;
    }
}
