package com.tac.linkedlist;

import java.util.LinkedList;
import java.util.List;
//get(index),getFirst(),getLast()
public class RetrieveLinkedListElementsExample {
    public static void main(String[] args) {
    LinkedList<String> fruits = new LinkedList<>();
     fruits.add("Apple"); //0
     fruits.add("Banana"); //1
     fruits.add("Cherry");//2
     fruits.add("Orange");// 3
     fruits.add("Grapes");
        System.out.println("LinkedList:"+fruits);
        String firstFruit=fruits.getFirst();
        System.out.println("The First element:"+firstFruit);
        String lastFruit = fruits.getLast();
        System.out.println("The Last element:"+lastFruit);
      //get() -> get the element at a given index in the linkedList.
       String fetchedFruit= fruits.get(4);
        System.out.println("Here is the fetched fruit:"+fetchedFruit);
    }
}
