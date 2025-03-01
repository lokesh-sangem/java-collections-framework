package com.tac.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println(programmingLanguages);
       String removed= programmingLanguages.remove(5);
        System.out.println("Removed element at index 5: "+removed);
        System.out.println(programmingLanguages);
//=====
        boolean isRemoved=programmingLanguages.remove("Kotlin");
        System.out.println("The element is removed:"+isRemoved);
        System.out.println(programmingLanguages);


    }
}
