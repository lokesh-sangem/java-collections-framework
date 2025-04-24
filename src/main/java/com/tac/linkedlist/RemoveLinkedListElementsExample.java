package com.tac.linkedlist;

import java.util.LinkedList;

//removeFirst(),removeLast(),removeIf(),remove(),clear()
public class RemoveLinkedListElementsExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple"); //0
        fruits.add("Banana"); //1
        fruits.add("Cherry");//2
        fruits.add("Orange");// 3
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Orange");
        System.out.println("LinkedList:"+fruits);

        String removedFruit=fruits.removeFirst();
        System.out.println("First removed one:"+removedFruit);
         String lastRemovedFruit=fruits.removeLast();
        System.out.println("Last removed one:"+lastRemovedFruit);
        String removedElement=fruits.remove(1);
        System.out.println("Removed element:"+removedElement);
        fruits.remove("Orange");
        System.out.println("Refined fruits list:"+fruits);
//       fruits.removeIf(fruit->fruits.forEach(fruit.startsWith("B")));
        fruits.removeIf((fruit)->fruit.startsWith("B"));
        System.out.println(fruits);
        fruits.removeIf((fruit)->fruit.startsWith("G"));
        System.out.println(fruits);

        fruits.clear();
        System.out.println("Printing fruits list after clear():"+fruits);
    }
}
