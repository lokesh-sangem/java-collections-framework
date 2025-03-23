package com.tac.arrayList;


import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayListExample {
    public static void main(String[] args) {
       List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the TopCompanies List is empty:"+topCompanies.isEmpty());
//        topCompanies
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        System.out.println("Here are the top"+" "+topCompanies.size()+" "+"companies");

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(4);

        System.out.println(bestCompany);
        System.out.println(secondBestCompany);
        System.out.println(lastCompany);

        topCompanies.set(4,"Walmart");

        System.out.println(topCompanies);
//"iam adding some changes here"

    }
}
