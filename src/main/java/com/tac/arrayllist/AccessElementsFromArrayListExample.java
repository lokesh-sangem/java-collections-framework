package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.List;

//isEmpty(),size(),get(),set()  methods.
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the top companies list empty ?:"+topCompanies.isEmpty());//it returns boolean
        topCompanies.add("Google"); // 0
        topCompanies.add("Apple"); // 1
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        System.out.println("here are the top "+topCompanies.size()+ " companies in the world");

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(3);
        System.out.println(bestCompany);
        System.out.println(secondBestCompany);
        System.out.println(lastCompany);

        topCompanies.set(3,"Meta");
        System.out.println("Here is updated company list:"+topCompanies);
    }
}
