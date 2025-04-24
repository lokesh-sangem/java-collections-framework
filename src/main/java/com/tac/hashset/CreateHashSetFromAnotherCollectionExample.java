package com.tac.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//add() ,addAll()
public class CreateHashSetFromAnotherCollectionExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //create one more ArrayList collection
        List<Integer> list2 =  new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        //create a HashSet from another collection using the HashSet(Collection c) constructor.
        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println(set1);
        set1.addAll(list2);
        System.out.println(set1);
        //add all the elements
    }
}
