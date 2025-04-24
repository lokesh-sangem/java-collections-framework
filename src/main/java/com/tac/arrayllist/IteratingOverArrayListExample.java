package com.tac.arrayllist;
 //iterator and java8 forEachRemaining() method,
// simple for loop,for each loop,java 8 forEach and lambda expressions.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        //using simple for loop
        System.out.println("=======================================");
        System.out.println("Iterating elements using for loop:");
        for(int i=0;i<programmingLanguages.size();i++){
            System.out.println(programmingLanguages.get(i));
        }
        //using for-each loop
        System.out.println("=======================================");
        System.out.println("Iterating things using for each loop:");
        for(String language:programmingLanguages){
            System.out.println(language);
        }
        System.out.println("=======================================");
         //using iterator()
        System.out.println("using Iterator()");
        Iterator<String> iterator=programmingLanguages.iterator();
          while(iterator.hasNext()){
              System.out.println(iterator.next());
          }

        System.out.println("==Iterating arrayList using forEachRemaining method=========");
          //forEachRemaining() method takes Consumer as  functionalInterface, we need to-
        // -provide lambda expression to implement this.
          programmingLanguages.iterator().forEachRemaining((element)->{
              System.out.println(element);
          });

        // java 8 for Each and lambda expression
        System.out.println("Iterating things using java8 forEach method.");
        programmingLanguages.forEach((element)->{
            System.out.println(element);
        });



    }
}
