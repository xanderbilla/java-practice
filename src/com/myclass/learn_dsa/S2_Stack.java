package com.myclass.learn_dsa;

import java.util.Scanner;
import java.util.Stack;

class PreStack{
    public void stlStack() {
        /*
         * Stack in build methods
         * 
         * push() - insert element at top of stack
         * pop() - remove element from top of stack
         * peek() - return top element of stack
         * empty() - return true if stack is empty
         * search() - return position of element from top of stack
         * size() - return size of stack
         * 
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Size of stack is: " + stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(20));
        System.out.println(stack.search(40));
    }

    public void copyStack(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            stack.push(sc.nextInt());
        }

        System.out.print("Original Stack: ");
        System.out.println(stack);

        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            tempStack.push(stack.pop()); //pop() remove and display element from top of stack
        }

        System.out.print("Reversed Stack: ");
        System.out.println(tempStack);
        sc.close();

        Stack<Integer> duplicateStack = new Stack<>();
        while(!tempStack.isEmpty()){
            duplicateStack.push(tempStack.pop());
        }
        System.out.print("Duplicate Stack: ");
        System.out.println(duplicateStack);
    }

    //Insert element at given position (using iteration)
    public void insertAtPosIter(Stack<Integer> stack, int x, int pos){
        if (pos < 0 || pos > stack.size()) {
            throw new IllegalArgumentException("Position out of range");
        }
        if(stack.empty()){
            if(pos == 0){
                stack.push(x);
                return;
            }
            else{
                throw new IllegalArgumentException("Position out of range");
            }
        }
        Stack<Integer> tempStack = new Stack<>();
        while(stack.size() > pos){
            tempStack.push(stack.pop());
        }
        stack.push(x);
        while(!tempStack.empty()){
            stack.push(tempStack.pop());
        }
        System.out.println("Stack after inserting element at position " + pos + " is: " + stack);
    }

    //Print stack using iteration
    public void printStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.empty()){
            tempStack.push(stack.pop());
        }
        while(!tempStack.empty()){
            System.out.print(tempStack.peek() + " ");
            stack.push(tempStack.pop());
        }
    }

    //Print stack using iteration and array
    public void printStackArray(Stack<Integer> stack){
        int[] arr = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.empty()){
            arr[i] = stack.pop();
            i--;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
            stack.push(arr[j]);
        }
    }

    //Print stack using recursion
    public void printStackRec(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int x = stack.pop();
        printStackRec(stack);
        System.out.print(x + " ");
        stack.push(x);
}

public class S2_Stack {
    public static void run() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Initial Stack: " + stack);
        PreStack preStack = new PreStack();
        // preStack.stlStack();
        // preStack.copyStack();
        preStack.insertAtPosIter(stack, 50, 0);
    }
}
