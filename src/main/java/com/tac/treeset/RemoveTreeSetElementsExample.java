package com.tac.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;
//remove(),removeIf(),pollFirst(),pollLast()
//pollFirst() - >Retrieve and remove the first element from the given predicate
//pollLast() ->Retrieve and remove the last element from the TreeSet
public class RemoveTreeSetElementsExample {
    public static void main(String[] args) {
       //create a TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);
        //remove()
       boolean isRemoved =numbers.remove(9);
        System.out.println(isRemoved);
        numbers.removeIf((num)->num%2==0);
        System.out.println("After removing numbers:"+numbers);
        //pollFirst()
        Integer firstElement = numbers.pollFirst();
        System.out.println("Retrieve :"+firstElement);
        Integer lastElement=numbers.pollLast();
        System.out.println("Retrive last element:"+lastElement);
        //pollLast()
        System.out.println(numbers); //o/p: 7



    }
}
