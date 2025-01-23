package com.myclass.pep_classes;

class Node {
    public int data;
    public Node next;

    public Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class LLOperation {
    Node head;

    LLOperation() {
        head = null;
    }

    public void sortedInsertion(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }
        if (head.data > val) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < val) {
            if (temp.data < val) {
                temp = temp.next;
            }
            newNode = temp.next;
            temp.next = newNode;
            return;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class P6_AdvLinkdList {
    public static void run(){
        LLOperation ll = new LLOperation();
        ll.sortedInsertion(10);
        ll.sortedInsertion(56);
        ll.sortedInsertion(42);
        ll.sortedInsertion(13);
        ll.sortedInsertion(5);
        ll.sortedInsertion(6);
        ll.display();
    }
}
