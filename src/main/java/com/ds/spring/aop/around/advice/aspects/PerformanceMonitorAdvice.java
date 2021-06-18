package com.ds.spring.aop.around.advice.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitorAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
       long start = System.currentTimeMillis();
       Object returnVal = methodInvocation.proceed();
       long end = System.currentTimeMillis();
       System.out.println("Total execution time of the method :" + methodInvocation.getMethod().getName()
               + " "+ (end-start));
       return returnVal;
    }
}
