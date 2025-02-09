package com.myclass.pep_classes;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class ArrayPractice {

    public void handshakePairs(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                System.out.println(list.get(i) + " <-> " + list.get(j));
            }
        }
    }

    public void divEqual(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) % list.get(i) == 0 && list.get(j) / list.get(i) == 2) {
                    System.out.println(list.get(j) + " <-> " + list.get(i));
                }
            }
        }
    }

    public List<Integer> bubbleSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean swap = false;
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swap = true;
                }
                if (swap == false) {
                    break;
                }
            }
        }
        return list;
    }

    // Find first avg of first 4 elements using bubble
    public int top4Average(List<Integer> list) {
        int k = 4;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            boolean swap = false;
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swap = true;
                }
            }
            sum += list.get(list.size() - 1 - i);

            if (!swap) {
                break;
            }
        }
        int average = sum / k;
        return average;
    }

    /*
     * Selection sort
     * 
     * Arr = [4, 1, 2, 3, 5]
     * 
     * S1 -> Find smallest element in the array and swap it with the first element
     * [1, 4, 2, 3, 5]
     * 
     * S2 -> Find the second smallest element in the array and swap it with the
     * second element
     * [1, 2, 4, 3, 5]
     * 
     * S3 -> Find the third smallest element in the array and swap it with the third
     * element
     * [1, 2, 3, 4, 5]
     */
    public List<Integer> selectionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) { // ith element to last element
                if (list.get(j) < list.get(minIndex)) { // check if jth element is smaller than minIndex
                    minIndex = j;
                }
            }
            if (minIndex != i) { // if minIndex is not equal to i then swap the elements
                Collections.swap(list, i, minIndex);
            }
        }
        return list;
    }

    // Find first avg of first 4 elements using selection

    /*
     * Insertion sort
     * 
     * [5, 1, 2, 3, 4]
     * Step 1-> Let's assume 5 is sorted and start from 1
     * [1, 5, 2, 3, 4]
     * 
     * Step 2-> Let's assume 1, 5 is sorted and start from 2
     * [1, 2, 5, 3, 4]
     * 
     * Step 3-> Let's assume 1, 2, 5 is sorted and start from 3
     * [1, 2, 3, 5, 4]
     * 
     * Step 4-> Let's assume 1, 2, 3, 5 is sorted and start from 4
     * [1, 2, 3, 4, 5]
     * 
     */
    public List<Integer> insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
        return list;
    }
}

public class P9_Array {
    public static void run() {
        List<Integer> list = Arrays.asList(4, 1, 5, 2, 3);
        System.out.println("List: " + list);
        ArrayPractice arrayPractice = new ArrayPractice();
        // arrayPractice.handshakePairs();
        // arrayPractice.divEqual(list);
        // List<Integer> sortedList = arrayPractice.bubbleSort(list);
        // List<Integer> sortedList = arrayPractice.selectionSort(list);
        List<Integer> sortedList = arrayPractice.insertionSort(list);
        System.out.println(sortedList);
    }
}