package com.tac.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//remove,removeAll,removeIf(),clear()
public class RemovingElementsExample {
    public static void main(String[] args) {
     //create a HashSet and adding elements
        //remove()
        //removeAll()
        //removeIf()
        //clear()
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
       boolean isRemoved= numbers.remove(8); //here remove method accepts object.
        System.out.println("The element is removed:"+isRemoved);
        //removeAll()
        List<Integer> perfectSquares = new ArrayList<>();
        perfectSquares.add(4);
        perfectSquares.add(9);
        perfectSquares.add(16);
        perfectSquares.add(25);
        perfectSquares.add(36);

        numbers.removeAll(perfectSquares);
        System.out.println("Elements after removing :"+numbers);
        System.out.println(perfectSquares);

//        removeIf()
        numbers.removeIf((num)->num % 2 == 0);// remove even numbers
        System.out.println(numbers);

        //clear()
        numbers.clear();
        System.out.println("Cleared elements:"+numbers);

    }
}
