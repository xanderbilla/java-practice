package com.myclass.pep_classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SortAlgo {
    public void sortAlgo(List<Integer> list) {
        int smallIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                if(list.get(j) < list.get(smallIndex)){
                    smallIndex = j;
                }
            }
            if(smallIndex != i){
                Collections.swap(list, i, smallIndex);
            }
        }

        System.out.println(list);
    }

    public int top4Average(List<Integer> list) {
        int k = 4;
        int sum = 0;
        int smallIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                if(list.get(j) < list.get(smallIndex)){
                    smallIndex = j;
                }
            }
            if(smallIndex != i){
                Collections.swap(list, i, smallIndex);
            }
        }
        int average = sum / k;
        return average;
    }
}

public class Test {
    public static void run() {
        SortAlgo arr = new SortAlgo();
        List<Integer> list = Arrays.asList(5, 4, 2, 1, 8, 3, 6, 7);
        // int avg = arr.top4Average(list);
        // System.out.println("Average: " + avg);
        // System.out.println(list);
        arr.sortAlgo(list);
    }
}
