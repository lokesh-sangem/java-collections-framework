package com.tac.arraylist;

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

        List<String>scriptingLanguages= new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        boolean isRemovedAll=programmingLanguages.removeAll(scriptingLanguages);
        System.out.println(isRemovedAll);

        System.out.println(programmingLanguages);

        boolean result=programmingLanguages.removeIf(element->element.startsWith("C"));
        System.out.println(result);

        System.out.println(programmingLanguages);
        programmingLanguages.clear();
        System.out.println(programmingLanguages);
    }
}
