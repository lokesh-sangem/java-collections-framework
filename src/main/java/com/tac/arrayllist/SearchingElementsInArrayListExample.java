package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.List;

//contains(),indexOf(),lastIndexOf(),
public class SearchingElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Java");

        //contains() method - takes Object as parameter and returns boolean.
        boolean doesContains=programmingLanguages.contains("Java");
        System.out.println(doesContains);
        int index=programmingLanguages.indexOf("Java"); //indexOf methods returns indexOf first occurence of elememnt in arraylist.
        System.out.println("Index of java is :"+index);
        int lastIndex=programmingLanguages.lastIndexOf("Java");
        System.out.println("Last Index of java is :"+lastIndex);




    }
}
