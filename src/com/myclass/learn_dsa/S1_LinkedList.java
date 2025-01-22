package com.myclass.learn_dsa;

/*
 * Limitations of Array -
 * 
 * 1. Fixed Size
 * 2. Memory waste (if we don't know the size of the array)
 * 3. Contiguous memory allocation
 * 4. Access time is O(1) but insertion and deletion time is O(n)
 * 
 * LinkedList -
 * 
 * A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
 * The elements in a linked list are linked using pointers.
 * In Java, Linked List use references to store the address of the next node.
 * 
 * Refereces are used to store the address of the next node.
 * 
 * Features of LinkedList -
 * 
 * 1. Dynamic Size
 * 2. Memory Utilization
 * 3. Non-Contiguous memory allocation
 * 
 * Limitations of LinkedList -
 * 
 * 1. Access time is O(n) but insertion and deletion time is O(1)
 * 2. Extra memory space for references
 * 3. Not cache friendly
 * 4. Not suitable for small data
 * 
 * Types of LinkedList -
 * 
 * 1. Singly LinkedList
 * 2. Doubly LinkedList
 * 3. Circular LinkedList
 * 4. Doubly Circular LinkedList
 * 5. Skip LinkedList
 * 6. Multi-Level LinkedList
 * 
 * Operations on LinkedList -
 * 
 * - Insertion
 * - Deletion
 * - Traversal
 * - Searching
 * - Sorting
 * - Reversing
 * - Merging
 * - Splitting
 * - Cloning
 * 
 * Applications of LinkedList -
 * 
 * - Implementation of Stacks and Queues
 * - Implementation of Graphs
 * - Implementation of Hash Tables
 * - Implementation of Memory Management
 * - Implementation of File Systems
 * 
 * - Linked List consists of nodes where each node contains a 
 * data field and a reference(link) to the next node in the list.
 * 
 * - The last node has a reference to null. 
 * - The entry point into a linked list is called the head of the list.
 * - The head is a reference to the first node in the linked list.
 * - The last node has a reference to null also called the tail.
 * - It should be noted that the head is not a separate node, but the reference to the first node.
 */

class Node {
    public int data; // Value
    public Node next; // Node data type (address of next node)

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    public Node head;

    /*
     * Singly Linked List -
     * 
     * - A singly linked list always contains a reference to the next node in the
     * list.
     * - The first node is called the head and the last node is called the tail.
     * - The tail points to null.
     * - The entry point into a linked list is called the head of the list.
     * 
     * Limitations of Singly LinkedList -
     * 
     * - Cannot traverse in the reverse direction.
     */

    SinglyLinkedList() {
        this.head = null;
    }

    // Traversal -
    /*
     * Initialize temp as head
     * While temp is not null
     * Print temp.data
     * Move temp to the next node (temp = temp.next)
     */

    public void display(Node head) {
        Node temp = head; // tmep prevent the head from being modified, where head is pointing to the
                          // first node
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Traversal using recursion
    public void displayRecursion(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        displayRecursion(head.next);
        System.out.print(head.data + " -> ");
    }
}

public class S1_LinkedList {
    public static void test() {
        Node node_1 = new Node(10);
        Node node_2 = new Node(16);
        Node node_3 = new Node(41);
        Node node_4 = new Node(36);
        Node node_5 = new Node(56);
        Node node_6 = new Node(6);
        // Before => 10 16 41 36 56 6
        node_1.next = node_2; // 10 -> 16 41 36 56 6
        node_2.next = node_3; // 10 -> 16 -> 41 36 56 6
        node_3.next = node_4; // 10 -> 16 -> 41 -> 36 56 6
        node_4.next = node_5; // 10 -> 16 -> 41 -> 36 -> 56 6
        node_5.next = node_6; // 10 -> 16 -> 41 -> 36 -> 56 -> 6 - LinkedList is ready
        // After => 10 16 41 36 56 6
        // System.out.println(node_1); // ...Node@28a418fc
        // System.out.println(node_1.next); // ...Node@5305068a
        // System.out.println(node_2); // ...Node@5305068a
        // System.out.println(node_3); // ...Node@1f32e575
        // System.out.println(node_4); // ...Node@279f2327
        // System.out.println(node_5); // ...Node@2ff4acd0
        // System.out.println(node_6); // ...Node@54bedef2

        // Access the data of the node_2 without using the reference of node_2

        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.display(node_1);
        sll.displayRecursion(node_1);

        // System.out.println(node_1.next.data); // 16

        /*
         * Key Points -
         * 
         * - The address of the node_2 is stored in the next field of node_1 thats why
         * node_1.next is equal to node_2 address.
         */
    }

}