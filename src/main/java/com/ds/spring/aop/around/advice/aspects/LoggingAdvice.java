package com.ds.spring.aop.around.advice.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.stream.IntStream;

public class LoggingAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String methodName = methodInvocation.getMethod().getName();
        Object[] arguments = methodInvocation.getArguments();
        Object target = methodInvocation.getThis();
//        System.out.println(target);

        System.out.print("entered into method :" + methodName + "(");
        IntStream.range(0, arguments.length).forEach(index -> {
            if(index == 0 )
                System.out.print(arguments[index]) ;
            else
                System.out.print("," +arguments[index]);
        });

        System.out.println(")");

        Object returnVal = methodInvocation.proceed();

        System.out.println("exiting from method :" + methodName + "with return value :" + returnVal);
        return  returnVal;
    }

}
