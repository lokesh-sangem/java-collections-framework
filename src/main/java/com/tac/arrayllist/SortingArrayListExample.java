package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//sorting arrayList sorting.
public class SortingArrayListExample {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Collections.sort(list);
        System.out.println("Ascending order of list:"+list);
         //for int type we use Collections.reverseOrder(); //here we use collections class.
        Collections.sort(list,Collections.reverseOrder()); //here sort method accepts two parameters.
        System.out.println("Descending order of list:"+list);
      //Sort an ArrayList using  ArrayList.sort() method.
       list.sort((o1,o2)->o1.compareTo(o2)); //sorting manually.
        // performing sorting using built in methods.
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        System.out.println("=================================");
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");

        Collections.sort(programmingLanguages);
        System.out.println(programmingLanguages);
        Collections.sort(programmingLanguages,Comparator.reverseOrder()); //for String type we use Comparator.reverseOrder();

        //note: Comparator.naturalOrder() -> for ascending order.
        // note: Comparator.reverseOrder() -> for descending order.
        System.out.println(programmingLanguages);
    }
}
