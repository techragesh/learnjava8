package com.techjava.functionalinterface;

public class FunctionalInterfaceEx2 {

    public static void main(String[] args) {
        MyInterfacewithParam myInterfacewithParam = (age, username) -> {
            System.out.println("Age is " + age);
            System.out.println("Username is " + username);
        };
        myInterfacewithParam.method3(12, "Ajay");
    }
}
