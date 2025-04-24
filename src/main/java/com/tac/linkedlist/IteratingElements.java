package com.tac.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//for-each loop, iterator,forEachRemaining(),descendingIterator(),
public class IteratingElements {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple"); //0
        fruits.add("Banana"); //1
        fruits.add("Cherry");//2
        fruits.add("Orange");// 3
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("LinkedList:"+fruits);
//        fruits.iterator();
        System.out.println("Iterating using for loop");
       for(String fruit:fruits){
           System.out.println(fruit);
       }

        //iterating things using iterator()
        System.out.println("Using iterator() to iterate over the linkedlist");
        Iterator<String> iterator=fruits.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

        System.out.println("\n Using iterator() and foreachRemaining method");
        Iterator<String>stringIterator = fruits.iterator();
        stringIterator.forEachRemaining(fruit-> System.out.println(fruit));

        System.out.println("Using dedscendingIterator() to iterate over the linkedList in reverse order");
        System.out.println("\"descending iterator:\"");
        Iterator<String>descIterator=fruits.descendingIterator();
        while(descIterator.hasNext()){
            System.out.println(descIterator.next());
        }

        System.out.println("Iterating things using for each:");
        fruits.forEach(fruit -> System.out.println(fruit));

    }

}
