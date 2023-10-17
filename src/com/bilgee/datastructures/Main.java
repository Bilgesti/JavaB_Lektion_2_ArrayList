package com.bilgee.datastructures;

import org.w3c.dom.ls.LSException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Fixed sized ??? begränsad storlek
        int[] scores = { 0, 150, 500 }; // Delete not Add elements - Impossible!

        // TODO One element: [prev, ELEMENT, next]

        // Arraylist
        ArrayList<Integer> scoreList = new ArrayList<>(); // NOT- recommended

        List<Integer> scoreLinkedList = new LinkedList<>();

        // List + Arraylist
        List<Integer> scoreList2 = new ArrayList<>(20); // Recommended

        scoreList2.add(100); // Add new index with, element: 100
        scoreList2.add(200);
        scoreList2.add(300);

        scoreList2.set( 1,400 );

        System.out.println(scoreList2);


        // List || LinkedList
       //scoreLinkedList.addFirst( 150 );
        System.out.println("LINKED LIST");
        System.out.println(scoreLinkedList);



        // Initial ArrayList values
        List<Integer> testList = new ArrayList<>(
                Arrays.asList(0,150,500) // InitialSize = 3
        );

        System.out.println(testList);


    }
}
