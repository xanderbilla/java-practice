package com.myclass.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * LeetCode 21 - Merge Two Sorted Lists
 * 
 * Represents a linked list implementation that maintains a sorted order when
 * adding elements.
 * New elements are inserted in their correct position to maintain ascending
 * order.
 * 
 * Problem Statement:
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two
 * lists.
 * 
 * Features:
 * - Maintains sorted order during insertion
 * - Provides display functionality to print list elements
 * - Handles edge cases like empty list and insertion at head
 * 
 * Time Complexity:
 * - Add operation: O(N) where N is number of nodes
 * - Display operation: O(N) where N is number of nodes
 * 
 * Space Complexity: O(1) for add operation, O(N) for display due to ArrayList
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class L021_MergeTwoSortedArr {
    private static class Solution {
        public void mergeSortedArr(List<Integer> list1, List<Integer> list2) {
            MergeList mergedList = new MergeList();
            
            // Add all elements from both lists
            for (int num : list1) {
                mergedList.add(num);
            }
            for (int num : list2) {
                mergedList.add(num);
            }
            
            // Display the merged sorted list
            mergedList.display();
        }
    }
    
    private static class MergeList {
        private Node head;

        private MergeList() {
            this.head = null;
        }

        private void add(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            if (val <= head.data) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data < val) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        private void display() {
            List<Integer> list = new ArrayList<>();
            if (head == null) {
                return;
            }
            Node temp = head;
            while (temp != null) {
                list.add(temp.data);
                temp = temp.next;
            }
            System.out.println(list);
        }
    }

    public static void run() {
        Solution solution = new Solution();
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 1, 6, 8, 10);
        solution.mergeSortedArr(list1, list2);
    }
}
