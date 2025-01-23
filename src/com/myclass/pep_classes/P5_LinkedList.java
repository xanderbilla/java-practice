package com.myclass.pep_classes;

class SNode{
    int data;
    SNode next;
    SNode(int data){
        this.data = data;
        this.next = null;
    }
}

class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class SinglyLinkedList{
    SNode head;
    SNode tail;
    int size;
    SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data){
        SNode node = new SNode(data);
        if(this.size == 0){
            this.head = this.tail = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(int data){
        SNode node = new SNode(data);
        if(this.size == 0){
            this.head = this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addAt(int data, int idx){
        if(idx < 0 || idx > this.size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            addFirst(data);
        }else if(idx == this.size){
            addLast(data);
        }else{
            SNode node = new SNode(data);
            SNode prev = getNodeAt(idx - 1);
            node.next = prev.next;
            prev.next = node;
            this.size++;
        }
    }

    public SNode getNodeAt(int idx){
        SNode temp = this.head;
        while(idx-- > 0){
            temp = temp.next;
        }
        return temp;
    }

    public void removeFirst(){
        if(this.size == 0){
            System.out.println("List is Empty");
            return;
        }
        if(this.size == 1){
            this.head = this.tail = null;
        }else{
            SNode temp = this.head;
            this.head = this.head.next;
            temp.next = null;
        }
        this.size--;
    }

    public void removeLast(){
        if(this.size == 0){
            System.out.println("List is Empty");
            return;
        }
        if(this.size == 1){
            this.head = this.tail = null;
        }else{
            SNode temp = getNodeAt(this.size - 2);
            temp.next = null;
            this.tail = temp;
        }
        this.size--;
    }

    public void removeAt(int idx){
        if(idx < 0 || idx >= this.size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            removeFirst();
        }else if(idx == this.size - 1){
            removeLast();
        }else{
            SNode prev = getNodeAt(idx - 1);
            SNode temp = prev.next;
            prev.next = temp.next;
            temp.next = null;
            this.size--;
        }
    }

    public void display(){
        SNode temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class DoublyLinkedList{
    DNode head;
    DNode tail;
    int size;
    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data){
        DNode node = new DNode(data);
        if(this.size == 0){
            this.head = this.tail = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(int data){
        DNode node = new DNode(data);
        if(this.size == 0){
            this.head = this.tail = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
        this.size++;
    }

    public void addAt(int data, int idx){
        if(idx < 0 || idx > this.size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            addFirst(data);
        }else if(idx == this.size){
            addLast(data);
        }else{
            DNode node = new DNode(data);
            DNode prev = getNodeAt(idx - 1);
            node.next = prev.next;
            prev.next.prev = node;
            prev.next = node;
            node.prev = prev;
            this.size++;
        }
    }

    public DNode getNodeAt(int idx){
        DNode temp = this.head;
        while(idx-- > 0){
            temp = temp.next;
        }
        return temp;
    }

    public void removeFirst(){
        if(this.size == 0){
            System.out.println("List is Empty");
            return;
        }
        if(this.size == 1){
            this.head = this.tail = null;
        }else{
            DNode temp = this.head;
            this.head = this.head.next;
            temp.next = null;
            this.head.prev = null;
        }
        this.size--;
    }
}
public class P5_LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(10); // 10
        list.addFirst(20); // 20 -> 10
        list.addFirst(30); // 30 -> 20 -> 10
        list.addLast(40); // 30 -> 20 -> 10 -> 40
        list.addLast(50); // 30 -> 20 -> 10 -> 40 -> 50
        list.addAt(25, 2); // 30 -> 20 -> 25 -> 10 -> 40 -> 50
        list.addAt(35, 4); // 30 -> 20 -> 25 -> 10 -> 35 -> 40 -> 50
        list.display(); // 30 -> 20 -> 25 -> 10 -> 35 -> 40 -> 50
        list.removeFirst(); // 20 -> 25 -> 10 -> 35 -> 40 -> 50
        list.removeLast(); // 20 -> 25 -> 10 -> 35 -> 40
        list.removeAt(2); // 20 -> 25 -> 35 -> 40
        list.display(); // 20 -> 25 -> 35 -> 40
    }    
}
