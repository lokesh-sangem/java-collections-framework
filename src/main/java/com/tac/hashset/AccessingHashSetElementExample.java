package com.tac.hashset;

import java.util.HashSet;
import java.util.Set;
//contains(),size(),isEmpty(),
public class AccessingHashSetElementExample {
    public static void main(String[] args) {
        Set<String> daysOfWeek=new HashSet<>();
        //add new element to the hashset using the add() method.
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);
        //contains() - check if a specific element exists in the HashSet
        if(daysOfWeek.contains("Monday")){
            System.out.println("Element exists");
         }else{
            System.out.println("Element doesnot exists");
        }
        //size() - Get the total number of elements in the HashSet
        int size=daysOfWeek.size();
        System.out.println("The size is :"+size);
        // isEmpty() - Check if the hashSet is empty.
       boolean isExists= daysOfWeek.isEmpty();
       if(isExists){
           System.out.println("The HashSet is empty"+isExists);
       }else{
           System.out.println("The HashSet is not empty");
       }
    }
}
