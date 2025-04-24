package com.tac.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDescendingOrderExample {
    public static void main(String[] args) {
        //here sortedset is a interface type for treeset
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);//things are sorted in reverse Order.


    }
}
