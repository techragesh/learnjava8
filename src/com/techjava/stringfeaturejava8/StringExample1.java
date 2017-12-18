package com.techjava.stringfeaturejava8;

import com.techjava.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringExample1 {
    public static void main(String[] args) {

        String student = String.join("-","Hello", "world", null);
        System.out.println("Student -------->" +student);

        //Join using List
        List<String> names = Arrays.asList("Ajay","Vijay","Malik");
        String nameList = String.join(",", names);
        System.out.println("Student List ------>" + nameList);

        //Join using Stream API
        List<Person> personList = Arrays.asList(
                new Person(1,"Ajay","Mumbai"),
                new Person(2, "Malik","Delhi"),
                new Person(3, "Peter", "Chennai")
        );
        String namesList = personList.stream()
                .map(person -> person.getPersonName().toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println("String join sample from Stream-- >" +nameList);

    }
}
