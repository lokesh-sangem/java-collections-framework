package com.tac.linkedlist;

import java.util.LinkedList;
import java.util.List;
//methods -> add(),add(index,element),addFirst(),addLast(),addAll().
public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String>fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Linked List after add():"+fruits);
        fruits.add(0,"Grapes");
        System.out.println(fruits);
        //addFirst() to add elements at first.
        fruits.addFirst("Pineapple");
        System.out.println(fruits);
        System.out.println("LinkedList after addFirst():"+fruits);
        // addLast() -to add elements at last
        fruits.addLast("Water Melons");
        System.out.println("Linked List after adding last element:"+fruits);
        //addAll() -> adding all the elements from an existing collection to the end of the linkedlist.
        List<String>moreFruits = new LinkedList<>();
        moreFruits.add("Orange");
        moreFruits.add("Watermelon");
        fruits.addAll(moreFruits);
        System.out.println("Complte list of fruits:"+fruits);



    }
}
