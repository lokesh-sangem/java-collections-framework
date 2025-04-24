package com.tac.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCaseInsensitiveExample {
    public static void main(String[] args) {
        //here sortedset is a interface type for treeset
        SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);
        fruits.add("banana"); //lower case elememts will be considered as duplicates because of case insensititve.
        System.out.println(fruits);
    }
}
