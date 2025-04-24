package com.tac.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSetExample {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");

        System.out.println("Iterating over hashSet using for each loop:");
   for(String languages : programmingLanguages){
       System.out.println(languages);
   }
    //Iterating over HashSet using iterator()
        System.out.println("Iterating over Hashset using iterator()");
        Iterator<String> iterator=programmingLanguages.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
 // Iterating  over HashSet using Iterator() and  Java 8  forEachRemaining() method
       Iterator<String>stringIterator= programmingLanguages.iterator();
        stringIterator.forEachRemaining((element)-> System.out.println(element));

        System.out.println("Iterating over HashSet using java 8 forEach and lambda expression");
        programmingLanguages.forEach((element)-> System.out.println(element));
    }

}
