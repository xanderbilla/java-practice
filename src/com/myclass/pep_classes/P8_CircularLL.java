package com.myclass.pep_classes;

class SNode {
    int data;
    SNode next;

    public SNode(int val) {
        this.data = val;
        this.next = null;
    }
}

class DNode {
    int data;
    DNode next;
    DNode prev;

    public DNode(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}

class SCircularLL {
    SNode head;

    SCircularLL() {
        head.next = null;
    }

    public void dsiplay() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        SNode temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }

    // Insertion at front
    public void insertAtFront(int data) {
        SNode newNode = new SNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        newNode.next = head;
        SNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        head = newNode;
    }

    // Insertion at end
    public void insertAtEnd(int data) {
        SNode newNode = new SNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        SNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Insert at position
    public void insertAtPosition(int val, int pos) {
        SNode newNode = new SNode(val);
        SNode temp = head;
        int count = 1;
        while (head == null) {
            return;
        }
        while (temp.next != null) {
            if (count == pos - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            count++;
        }

    }
}

class DCircularLL {
    DNode head;

    DCircularLL() {
        head.next = null;
        head.prev = null;
    }

    public void dsiplay() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        DNode temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }

    // Insertion at front
    public void insertAtFront(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            head.next = newNode;
            head.prev = newNode;
        }
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
        head = newNode;
    }

    // Insertion at end
    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            head.next = newNode;
            head.prev = newNode;
        }
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
    }

    // Insert at position
    public void insertAtPosition(int val, int pos) {
        DNode newNode = new DNode(val);
        DNode temp = head;
        int count = 1;
        while (head == null) {
            return;
        }
        while (temp.next != null) {
            if (count == pos - 1) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            count++;
        }
    }
}

public class P8_CircularLL {
    public static void run() {
        SCircularLL scll = new SCircularLL();
        scll.insertAtFront(10);
        scll.insertAtFront(20);
        scll.insertAtFront(30);
        scll.insertAtFront(40);
        scll.insertAtFront(50);
        scll.insertAtEnd(5);
        scll.insertAtEnd(4);
        scll.insertAtEnd(3);
        scll.insertAtEnd(2);
        scll.insertAtEnd(1);
        scll.dsiplay();
    }
}
