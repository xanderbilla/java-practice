package com.myclass.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A1_ArrayCollection {

    /*
     * Unlike a regular array, which has a fixed size, an ArrayList can grow
     * and shrink as elements are added orremoved.
     * 
     * This dynamic resizing is achieved by creating a new array when the current
     * array is full and copying the elements to the new array.
     * 
     * When you create an arrayList, it ha initial capacity default is 10. The
     * capacity
     * refers to the size of the internal array that holds elements before needing
     * to resize.
     * 
     * Adding an element
     * ==================
     * 
     * ➡️ Check capacity: Before adding the new element array checks if ther is
     * enough space
     * in the internal array. If the array is full it needed to be resized.
     * 
     * ➡️ Resize if necessry: If the internal array is full, the ArrayList will
     * create a new
     * array with a larger capacity(usually 1.5 times the current capacity) and copy
     * the element
     * from old to new array.
     * 
     * ➡️ Add the elements: The new element is than added to the internal array at
     * the appropriate
     * index and the size is incremented
     * 
     * Resize the array
     * =================
     * 
     * ➡️ Initial Capacity: By default the initial capacity is 10. This means intial
     * array can
     * hold upto 10 elements before it needs to grow.
     * 
     * ➡️ Growth factor: When the nternal array is full, a new array is creatd with
     * a size 1.5
     * times the old array. The growth factor balances memory efficiency ad resizing
     * cost.
     * 
     * ➡️ Copying elements: When resizing occurs, all elments from the old array are
     * copied to
     * the new array, which is an O(n) operation where n is the number of elements
     * in the
     * ArrayList
     * 
     * Removing Element
     * ================
     * 
     * ➡️ Check Bound: Array check if the index exist within a valid range.
     * 
     * ➡️ Remove the element: The lement is rmoved and all the element to the right
     * of the
     * removed elment are shifted one position to the left to fill the gap.
     * 
     * ➡️ Reduce size: The size is decremented by 1.
     * 
     * 
     * ⭐ Once the capaicty is increased it cannot be shrink automatically we need to
     * do it manually
     * using arr.trmiToSize()
     * 
     * Time Complexity
     * ===============
     * 
     * ➡️ Access by index is O(1)
     * ➡️ Adding an element is O(n) in the worst case when resizing occurs 
     * ➡️ Removing element can be O(n) because it may involve shifting elements
     * ➡️ Iteration is O(n)
     */

    public void myArray() {
        List<Integer> list = new ArrayList<>();
        // Set inital capacity is 20 (will be expanded later if required)
        // List<Integer> list = new ArrayList<>(20);
        list.add(65);
        list.add(10);
        list.add(45); // append an alement at the end of the list/array
        list.add(1, 15); // add an alement at the particular index - [5, 15, 10, 15]
        list.set(2, 30); // replace the provided element with already existed value
        System.out.println(list.size()); // get the size of array/list
        System.out.println(list.get(0)); // get a specific index value
        System.out.println(list.contains(50)); // check if '50' exists in array
        System.out.println(list.remove(2)); // remove the element present at second index

        list.remove(2); // remove element from a particular list using index


        /*
         * To remopve a particular value we must use wrapper class of the elemnt type
         */
        list.remove(Integer.valueOf(30)); // remove particular element



        List<Integer> arr = List.of(100,200,300,400,500);
        
        list.addAll(arr); // pass a collection to concatenate

        /*
         * Using for loop
         *
         * for (int i = 0; i < list.size(); i++) {
         * System.out.println(i);
         * }
         */
        for (int x : list) {
            System.out.println(x);
        }


        /*
         * Sorting the list we have two ways
         */
        Collections.sort(list);
        list.sort(null); // We are passing null because it takes comparator
    }

    public void onFlyArray() {
        /*
         * In this type where we use Array.asList(e1, e2, e3...).
         * We cannot add/remove new elements but we can modify only
         * 
         * This Arrays.asList() - it return a fixed size of list
         */
        List<Integer> list = Arrays.asList(10, 20, 30);
        System.out.println(list.getClass().getName());
        // list.add(20); ❎ Invalid
        // list.remove(2); ❎ Invalid
        list.set(2, 100); // ✅ Valid

        Integer[] arr = { 40, 50, 60, 70 };
        List<Integer> list1 = Arrays.asList(arr); // ✅ Valid
        System.out.println(list1.getClass().getName());

        /*
         * In this type where we use List.of(e1, e2, e3...) is strictly immuatble.
         * We cannot add/remove new elements or modify existing element
         * 
         * This List.of(e1, e2, e3...) - it return a fixed size of list
         */
        List<Integer> foo = List.of(10, 20, 30);
        System.out.println(foo);
        // foo.add(20); ❎ Invalid
        // foo.remove(2); ❎ Invalid
        // foo.set(2, 100); ❎ Invalid
    }
}
