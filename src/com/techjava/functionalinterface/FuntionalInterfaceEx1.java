package com.techjava.functionalinterface;

public class FuntionalInterfaceEx1 {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("This is the method2");
        myInterface.method2();
    }
}
