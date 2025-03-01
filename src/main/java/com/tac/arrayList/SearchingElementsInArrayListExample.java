package com.tac.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchingElementsInArrayListExample {
    public static void main(String[] args) {

        List<String> programmingLanguages=new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Kotlin");

        boolean hasElement=programmingLanguages.contains("Java");
        System.out.println(hasElement);

        int index=programmingLanguages.indexOf("Java");
        System.out.println("The index of element is : "+index);

        int lastIndex=programmingLanguages.lastIndexOf("Java");
        System.out.println("The last index of element java is :"+lastIndex);


    }
}
