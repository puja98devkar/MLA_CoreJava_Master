package com.learning.core.day4session1;

public class D04P0901 {
    private String[] stack;
    private int top;
    private int capacity;
 
    // Constructor to initialize the stack
    public D04P0901(int size) {
        stack = new String[size];
        capacity = size;
        top = -1;
    }
 
    // Method to add an element to the stack
    public void push(String item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
        } else {
            stack[++top] = item;
        }
    }
 
    // Method to remove an element from the stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return stack[top--];
        }
    }
 
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
 
    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
 
    // Method to print the stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        D04P0901 stack = new D04P0901(4); // Initialize stack with capacity 4
 
        // Push 4 elements
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
 
        System.out.print("After Pushing 4 Elements: ");
        stack.printStack();
 
        // Pop 1 element
        stack.pop();
 
        System.out.print("After a Pop: ");
        stack.printStack();
    }
}