package com.tac.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
//Enhanced for loop,for each loop ,iterator(),descendingIterator(),forEachRemaining,forEach with lambda
public class IterateTreeSetExample {
    public static void main(String[] args) {
        NavigableSet<String> fruits = new TreeSet<>();
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits); //things are sorted in ascending order
        System.out.println("Iterating things by using for-each loop");
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        System.out.println("Iterating things using iterator:");
        Iterator<String>iterator=fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Iterating using for each remianing:");
        fruits.iterator().forEachRemaining((fruit)-> System.out.println(fruit));

        System.out.println("Descending Iterator: ");
       Iterator<String>descIterator= fruits.descendingIterator();
          while(descIterator.hasNext()){
              System.out.println(descIterator.next());
          }

      //Iterating using forEach method
        System.out.println("\n Iterating using for each lambda:");
        fruits.forEach((fruit)-> System.out.println(fruit));
    }
}
