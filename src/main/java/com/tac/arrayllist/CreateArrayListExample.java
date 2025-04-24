package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String>animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Lion");
        animals.add(null);
        animals.add(null);
        System.out.println(animals);

        animals.add(1,"Elephant");
        System.out.println(animals);

    }
}
