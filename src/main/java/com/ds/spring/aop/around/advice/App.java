package com.ds.spring.aop.around.advice;

import com.ds.spring.aop.around.advice.aspects.LoggingAdvice;
import com.ds.spring.aop.around.advice.aspects.PerformanceMonitorAdvice;
import com.ds.spring.aop.around.advice.target.Calculator;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Calculator());
        pf.addAdvice(new PerformanceMonitorAdvice());
        pf.addAdvice(new LoggingAdvice());

        Calculator proxy = (Calculator) pf.getProxy();
        proxy.add(10,20);
        proxy.multiply(10,20);
        proxy.subtract(20,10);
        proxy.divide(20,2);





    }
}
