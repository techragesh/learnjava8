package com.techjava.functionalinterface;

@FunctionalInterface
public interface MyInterfacewithReturn {

    public abstract String method5();

    public default void method6(){
        System.out.println("In Default Method --6");
    }
}
