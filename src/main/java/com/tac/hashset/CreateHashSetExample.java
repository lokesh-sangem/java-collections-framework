package com.tac.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        Set<String> daysOfWeek=new HashSet<>();
        //add new element to the hashset using the add() method.
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);
        daysOfWeek.add("Monday"); //here hashset is not allowing duplicate values
        System.out.println(daysOfWeek);
        daysOfWeek.add(null);
        System.out.println(daysOfWeek);



    }
}
