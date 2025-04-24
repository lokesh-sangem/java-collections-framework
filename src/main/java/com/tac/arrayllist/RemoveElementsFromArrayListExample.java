package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.List;
// remove(index),remove(Object),clear(),removeIf(),removeAll() ,clear() etc
public class RemoveElementsFromArrayListExample {
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

       String removedElement= programmingLanguages.remove(0);
        System.out.println(removedElement); //removing element using index
        System.out.println(programmingLanguages);
        boolean isRemoved=programmingLanguages.remove("C++"); // removing element using object.
        System.out.println("Is element is removed?:"+isRemoved);
        System.out.println(programmingLanguages);

        List<String>scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages); //removeAll returns boolean
        System.out.println("Refined List of programming languages:"+programmingLanguages);

       boolean isElementRemoved= programmingLanguages.removeIf(element -> element.startsWith("K"));
        System.out.println("Is Element removed?:"+isElementRemoved);

        System.out.println("Programming languages:"+programmingLanguages);
        programmingLanguages.clear();
        System.out.print(programmingLanguages);








    }
}
