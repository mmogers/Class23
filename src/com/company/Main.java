package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(-2000);
        myTreeSet.add(18);
        myTreeSet.add(59);
        myTreeSet.add(1);
        myTreeSet.add(1994);
        myTreeSet.add(18); //will be removed as duplicate

        //print the whole treeSet
        System.out.println(myTreeSet);
        System.out.println(myTreeSet.first() + " first is the smallest ");
        System.out.println(myTreeSet.last() + " last is the biggest");

        myTreeSet.remove(59);
        System.out.println(myTreeSet + " after removing 59 " );

        TreeSet<String> myStringTreeSet = new TreeSet<>();
        myStringTreeSet.add("Marina");
        myStringTreeSet.add("Oxana");
        myStringTreeSet.add("Kate");
        myStringTreeSet.add("Oleg");
        myStringTreeSet.add("Artjoms");
        myStringTreeSet.add("Martins");

        System.out.println(myStringTreeSet);
        //---------------------




    }
}
