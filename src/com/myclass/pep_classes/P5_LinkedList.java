package com.myclass.pep_classes;

class SNode {
    public int val;
    public SNode next;

    public SNode(int data) {
        this.val = data;
        this.next = null;
    }
}

class SLinkedList {
    private SNode head;

    public SLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        SNode newNode = new SNode(data);
        newNode.next = head;
        head = newNode;
    }

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

    public void deleteAtFront() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAtEnd(){
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        SNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void display() {
        SNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void search(int data){
        if(head == null){
            return;
        }
        SNode temp = head;
        while(temp != null){
            if(temp.val == data){
                System.out.println("Found!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data not found");
    }


}

class DNode {
    public DNode prev;
    public int val;
    public DNode next;

    public DNode(int data) {
        this.prev = null;
        this.val = data;
        this.next = null;
    }
}

class DLinkedList{
    private DNode head;

    public DLinkedList(){
        this.head = null;
    }

    
}

public class P5_LinkedList {
    public static void test() {
        SLinkedList sll = new SLinkedList();
        sll.insertAtBeginning(10); // 10 -> Null
        sll.insertAtBeginning(20); // 20 -> 10 -> Null
        sll.insertAtBeginning(30); // 30 -> 20 -> 10 -> Null
        sll.insertAtEnd(40); // 30 -> 20 -> 10 -> 40 -> Null
        sll.insertAtEnd(50); // 30 -> 20 -> 10 -> 40 -> 50 -> Null
        sll.deleteAtFront(); // 20 -> 10 -> 40 -> 50 -> Null

        sll.display();
    }
}