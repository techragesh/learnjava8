package com.techjava.functionalinterface;

public class FunctionalInterfaceEx3 {
    public static void main(String[] args) {
        MyInterfacewithReturn myInterfacewithReturn = FunctionalInterfaceEx3 :: method5;

        String test = myInterfacewithReturn.method5();
        System.out.println(test);
    }

    private static String method5() {
        return "Welcome to Java8";
    }
}
