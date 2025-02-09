package com.myclass.pep_classes;

// Node class for Singly Circular Linked List
class SNode {
    int data;        // Data stored in the node
    SNode next;      // Reference to next node

    public SNode(int val) {
        this.data = val;
        this.next = null;
    }
}

// Node class for Doubly Circular Linked List
class DNode {
    int data;        // Data stored in the node
    DNode next;      // Reference to next node
    DNode prev;      // Reference to previous node

    public DNode(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}

// Singly Circular Linked List implementation
class SCircularLL {
    private SNode head;   // Head of the linked list

    // Initialize empty list
    SCircularLL() {
        head = null;      // Fixed: Initialize head as null instead of accessing it
    }

    // Display all elements in the list
    public void display() {   // Fixed: Corrected method name spelling
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        SNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");    // Added to show completion of circle
    }

    // Insert a new node at the beginning of the list
    public void insertAtFront(int data) {
        SNode newNode = new SNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;  // Point to itself for circular nature
            return;
        }
        
        // Find the last node and update connections
        SNode last = head;
        while (last.next != head) {
            last = last.next;
        }
        newNode.next = head;
        last.next = newNode;
        head = newNode;
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data) {
        SNode newNode = new SNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        
        // Find the last node and update connections
        SNode last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = newNode;
        newNode.next = head;
    }

    // Insert a new node at a specific position
    public void insertAtPosition(int val, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        SNode newNode = new SNode(val);
        SNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}

// Main class to demonstrate functionality
public class P8_CircularLL {
    public static void run() {
        System.out.println("Creating a Singly Circular Linked List:");
        SCircularLL list = new SCircularLL();
        
        // Adding elements at front
        System.out.println("\nInserting elements at front: 50, 40, 30, 20, 10");
        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtFront(30);
        list.insertAtFront(40);
        list.insertAtFront(50);
        
        // Adding elements at end
        System.out.println("\nInserting elements at end: 5, 4, 3, 2, 1");
        list.insertAtEnd(5);
        list.insertAtEnd(4);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        
        System.out.println("\nFinal list:");
        list.display();
    }
}
