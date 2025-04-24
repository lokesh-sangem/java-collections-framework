package com.tac.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {
    public static void main(String[] args) {
        SortedSet<String>fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);// here ,elements are printed in default natural sorted order.
        fruits.add("Banana"); // treeset doesnot allow duplicates.

        System.out.println(fruits);
        fruits.add("banana"); //treeset is case sensitive.
        System.out.println(fruits);



    }
}
