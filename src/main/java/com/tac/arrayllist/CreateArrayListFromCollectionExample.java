package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(6);
        myList2.add(7);
        myList2.add(8);
        myList2.add(9);
        myList2.add(10);

        List<Integer>myList3 = new ArrayList<>(myList); //passing myList object as a parameter to the constructor.
        System.out.println("Another arraylist:"+myList3);
        //adding araylist using addAll method.
        myList3.addAll(myList2);
        System.out.println("Added arrayList:"+myList3);
    }
}
