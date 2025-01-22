package com.myclass.pep_classes;

public class P4_Array {

    public void display(int[] arr ){
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public int[] insertAtEnd(int[] arr, int val){
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        return temp;
    }

    public int[] insertAtFirst(int[] arr, int val){
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i+1] = arr[i];
        }
        temp[0] = val;
        return temp;
    }

    public int[] insertAtPos(int[] arr, int val, int pos){
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        temp[pos] = val;
        for (int i = pos; i < arr.length; i++) {
            temp[i + 1] = arr[i];
        }
        return temp;
    }

    
    
}