package com.techjava.lamda;

import com.techjava.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1,"Malik","Mumbai"),
                new Person(2, "Ajay","Delhi"),
                new Person(3, "Peter", "Chennai")
        );
        System.out.println("----------------------------------------");
        System.out.println("Before Sorting");

        for (Person person : personList) {
            System.out.println(person.getPersonName() + " "  + person.getPersonLocation() );
        }

        System.out.println("----------------------------------------");

        Collections.sort(personList, Comparator.comparing(Person::getPersonName));

        System.out.println("After Sorting");

        for (Person person : personList) {
            System.out.println(person.getPersonName() + " "  + person.getPersonLocation() );
        }

        System.out.println("----------------------------------------");

    }
}
