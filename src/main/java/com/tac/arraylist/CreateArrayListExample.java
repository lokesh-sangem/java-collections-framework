package com.tac.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Lion");
        animals.add("Dog");
//        animals.add(null);
//        animals.add(null);
         animals.add(3,"Elephant");
        System.out.println(animals);
    }
}
