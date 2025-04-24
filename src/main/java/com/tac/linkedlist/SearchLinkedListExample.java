package com.tac.linkedlist;

import java.util.LinkedList;
import java.util.List;

//contains(),indexOf(),lastIndexOf(),
public class SearchLinkedListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple"); //0
        fruits.add("Banana"); //1
        fruits.add("Cherry");//2
        fruits.add("Orange");// 3
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("LinkedList:"+fruits);
      //contains()
        boolean isExist=fruits.contains("Banana");
        System.out.println(isExist);
        int index=fruits.indexOf("Cherry");
        System.out.println("The index of cherry is:"+index);
        int lastIndex=fruits.lastIndexOf("Orange");
        System.out.println("The last index of Orange :"+lastIndex);
    }
}
