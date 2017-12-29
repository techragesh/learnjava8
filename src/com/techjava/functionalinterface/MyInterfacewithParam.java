package com.techjava.functionalinterface;

@FunctionalInterface
public interface MyInterfacewithParam {

    public default void method4(){
        System.out.println("This is default method 4");
    }

    public abstract void method3(int age, String username);
}
