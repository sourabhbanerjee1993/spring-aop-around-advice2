package com.ds.spring.aop.around.advice.target;

public class Calculator {

    public int add(int a, int b) throws InterruptedException {
        Thread.sleep(3000);
        return a + b;
    }

    public int subtract(int a, int b) throws InterruptedException {
        Thread.sleep(4000);
        return a - b;
    }

    public long multiply(int a, int b) throws InterruptedException {
        Thread.sleep(5000);
        return a * b;
    }

    public double divide(int a, int b) throws InterruptedException {
        Thread.sleep(6000);
        return b==0 ? b/a : a/b;
    }
}
