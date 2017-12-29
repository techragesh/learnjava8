package com.techjava.functionalinterface;

@FunctionalInterface
public interface MyInterface {

    public default void method1() {
        System.out.println("This is the default method 1");
    }

    public abstract void method2();
}
