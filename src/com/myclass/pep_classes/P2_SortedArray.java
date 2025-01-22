package com.myclass.pep_classes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2_SortedArray {

    public static void mergeArray(List<Integer> arr1, List<Integer> arr2){
        List<Integer> arr = new ArrayList<>();
        arr.addAll(arr1);
        arr.addAll(arr2);

        Collections.sort(arr);

        for (Integer x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        
    }

    public static void run(){
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);

        arr2.add(5);
        arr2.add(15);
        arr2.add(25);
        arr2.add(35);
        arr2.add(45);
        arr2.add(55);

        mergeArray(arr1, arr2);
    }
}