package com.tac.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayListExample {
    public static void main(String[] args) {
        List<String>programmingLanguages=new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println("using simple for loop");
        //using simple for loop
        for(int i=0;i<programmingLanguages.size();i++){
            System.out.println(programmingLanguages.get(i));
        }
        System.out.println("using for-each loop");
        //using for-each loop
        for(String language:programmingLanguages){
            System.out.println(language);
        }

        //using iterator
        System.out.println("Using iterator()");
        Iterator<String> iterator=programmingLanguages.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Iterator() and java 8 forEachRemaining() method");

        programmingLanguages.iterator().forEachRemaining((element)->{
            System.out.println(element);
        });
        System.out.println("Java 8 forEach and lambda expression");
        programmingLanguages.forEach((element)->{
            System.out.println(element);
        });
    }
}
