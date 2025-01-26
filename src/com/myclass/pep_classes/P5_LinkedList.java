package com.myclass.pep_classes;
// Node class for S Linked List
class SNode {
    int data;
    SNode next;

    SNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Node class for Doubly Linked List
class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Singly Linked List operations
class SLinkedList {
    private SNode head;

    // Insert at front
    public void insertAtFront(int data) {
        SNode newNode = new SNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at position
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Position should be >= 1.");
            return;
        }

        if (position == 1) {
            insertAtFront(data);
            return;
        }

        SNode newNode = new SNode(data);
        SNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Insert at end
    public void insertAtEnd(int data) {
        SNode newNode = new SNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        SNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Search
    public boolean search(int data) {
        SNode temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Insert using array
    public void insertArray(int arr[]){
        for (int i : arr) {
            insertAtEnd(i);
        }
    }

    // Display
    public void display() {
        SNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// D Linked List operations
class DLinkedList {
    private DNode head;

    // Insert at front
    public void insertAtFront(int data) {
        DNode newNode = new DNode(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at position
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Position should be >= 1.");
            return;
        }

        if (position == 1) {
            insertAtFront(data);
            return;
        }

        DNode newNode = new DNode(data);
        DNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
        } else {
            newNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Insert at end
    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Search
    public boolean search(int data) {
        DNode temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Display
    public void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class P5_LinkedList {
    public static void run() {
        SLinkedList SLinkedList = new SLinkedList();
        SLinkedList.insertAtEnd(10);
        SLinkedList.insertAtEnd(20);
        SLinkedList.insertAtEnd(30);
        SLinkedList.insertAtFront(5);
        SLinkedList.insertAtPosition(15, 2);
        SLinkedList.display();
        System.out.println(SLinkedList.search(20));
        System.out.println(SLinkedList.search(25));

        DLinkedList DLinkedList = new DLinkedList();
        DLinkedList.insertAtEnd(10);
        DLinkedList.insertAtEnd(20);
        DLinkedList.insertAtEnd(30);
        DLinkedList.insertAtFront(5);
        DLinkedList.insertAtPosition(15, 2);
        DLinkedList.display();
        System.out.println(DLinkedList.search(20));
        System.out.println(DLinkedList.search(25));
    }
}