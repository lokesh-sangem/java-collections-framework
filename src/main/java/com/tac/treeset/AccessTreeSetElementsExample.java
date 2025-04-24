package com.tac.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;
// size(),contains(),first(),last(),higher(),lower()
public class AccessTreeSetElementsExample {
    public static void main(String[] args) {
        NavigableSet<String>fruits=new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Orange");
        System.out.println(fruits);

        System.out.println("Size of TreeSet is :"+fruits.size());
        //check if a specific element exists in a TreeSet using contains().
        if(fruits.contains("Banana")){
            System.out.println("Element exists");
        }
        else{
            System.out.println("Element doesnot exists");
        }
        System.out.println("First element in TreeSet :"+fruits.first());//to fetch first element
        System.out.println("Last element in TreeSet:"+fruits.last());// to fetch last element
        //find element just higher than the given element in the TreeSet using higher() method.
        System.out.println("Element just higher than apple is :"+fruits.higher("Apple"));//here higher method is available in navigable interface

        System.out.println("Element just lower than banana is :"+fruits.lower("Banana"));//here lower method is also in navigable interface.




        fruits.first();
        fruits.last();
        fruits.size();
       if( fruits.contains("Orange")){
           System.out.println(true);
       }
    }
}
