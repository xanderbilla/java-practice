package com.myclass.learn_dsa;

/**
 * A class representing a node in a singly linked list data structure.
 * Each node contains an integer value and a reference to the next node.
 */
class ListNode {
    /**
     * The integer value stored in this node
     */
    int val;

    /**
     * Reference to the next node in the linked list
     */
    ListNode next;

    /**
     * Default constructor that creates an empty node
     */
    ListNode() {
    }

    /**
     * Constructor that initializes the node with a given value
     * 
     * @param val The integer value to be stored in this node
     */
    ListNode(int val) {
        this.val = val;
    }

    /**
     * Constructor that initializes the node with a given value and next node
     * reference
     * 
     * @param val  The integer value to be stored in this node
     * @param next Reference to the next node in the linked list
     */
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * A class that implements basic LinkedList operations
 */
class Solution {
    private ListNode head;

    /**
     * Constructor to initialize an empty LinkedList
     */
    public Solution() {
        this.head = null;
    }

    /**
     * Inserts a new node at the front of the LinkedList
     * 
     * @param val value to be inserted
     */
    public void insertAtFront(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * Displays all elements in the linked list.
     * Traverses the linked list from head to tail and prints each element
     * followed by an arrow (->) symbol. The list ends with "null".
     * If the list is empty (head is null), the method returns without printing
     * anything.
     * 
     * Format of output: val1 -> val2 -> val3 -> null
     * 
     * Time Complexity: O(n) where n is the number of nodes in the list
     * Space Complexity: O(1)
     */
    public void display() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /**
     * Recursively displays the elements of the linked list starting from the given head node.
     * Each element is printed followed by an arrow (->) symbol.
     * The list ends with "null" to indicate the end of the list.
     *
     * @param head The starting node of the linked list to be displayed
     */
    public void displayRec(ListNode head){
        if(head == null){
            System.out.println("null");
            return;
        }
        System.out.print(head.val + " -> ");
        displayRec(head.next);
    }

    /**
     * Displays the elements of the linked list in reverse order using recursion.
     * This method recursively traverses to the end of the list and prints elements
     * while backtracking.
     *
     * @param node The starting node from which to begin the reverse display
     */
    public void displayRev(ListNode node){
        if(node == null){
            System.out.print("null");
            return;
        }
        displayRev(node.next);
        System.out.print(" -> " + node.val);
    }

    /**
     * Removes the first occurrence of a node with the specified key value from the linked list.
     * If the list is empty or the key is not found, no changes are made to the list.
     * 
     * @param key The value to be removed from the linked list
     * 
     * Case 1: If list is empty, method returns without any operation
     * Case 2: If head node contains the key, head is updated to next node
     * Case 3: For other positions, traverses the list to find and remove the node with matching key
     */
    public void removeNode(int key){
        if(head == null){
            return;
        }
        if (head.val == key) {
            head = head.next;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if(temp.next.val == key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    /**
     * Recursively removes the first occurrence of a node with the specified key value from the linked list.
     * 
     * @param head The head node of the linked list
     * @param key The value to be removed from the linked list
     * @return The head of the modified linked list after removal
     * 
     * Example:
     * For list: 1->2->3->4, key = 3
     * Result: 1->2->4
     * 
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(n) due to recursive call stack
     */
    public ListNode removeNodeRec(ListNode head, int key){
        if(head == null){
            return null;
        }
        if (head.val == key) {
            return head.next;
        }
        head.next = removeNodeRec(head.next, key);
        return head;
    }

    /**
     * Returns the head node of the linked list.
     * 
     * @return the first node (head) of the linked list
     */
    public ListNode getHead(){
        return head;
    }
}

/**
 * A class demonstrating Singly LinkedList operations and solutions.
 * This class provides functionality to perform various operations on
 * LinkedList.
 * 
 * @author Vikas Singh
 * @version 1.0
 * @since February 09, 2025
 */
public class S5_SinglyLinkedList {
    private static final Solution solution = new Solution();

    /**
     * Main method to run LinkedList operations
     */
    public static void run() {
        solution.insertAtFront(10); // 10 -> null
        solution.insertAtFront(20); // 20 -> 10 -> null
        solution.insertAtFront(30); // 30 -> 20 -> 10 -> null
        ListNode head = solution.getHead();
        solution.removeNodeRec(head, 10);
        solution.display();
    }
}