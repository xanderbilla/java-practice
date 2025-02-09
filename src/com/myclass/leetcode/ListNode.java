package com.myclass.leetcode;

/**
 * Definition for singly-linked list node.
 */
public class ListNode {
    private int val;
    private ListNode next;

    /**
     * Constructor to create a new node with given value
     * @param x the value to be stored in the node
     */
    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    /**
     * Get the value stored in the node
     * @return the value stored in the node
     */
    public int getVal() {
        return val;
    }

    /**
     * Set the value of the node
     * @param val the value to be set
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * Get the next node reference
     * @return reference to the next node
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * Set the next node reference
     * @param next reference to the next node
     */
    public void setNext(ListNode next) {
        this.next = next;
    }
}
