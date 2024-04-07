package com.learning.core.day4session1;

public class D04P0902 {
    private Node top;
 
    // Inner class for Node
    private class Node {
        Double data;
        Node next;
 
        Node(Double data) {
            this.data = data;
            this.next = null;
        }
    }
 
    // Constructor to initialize the stack
    public D04P0902() {
this.top = null;
    }
 
    // Method to add an element to the stack
    public void push(Double data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            System.out.println("Heap Overflow");
            return;
        }
 
        newNode.data = data;
        newNode.next = top;
        top = newNode;
    }
 
    // Method to remove an element from the stack
    public Double pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return null;
        }
 
        Double data = top.data;
        top = top.next;
        return data;
    }
 
    // Method to display the stack elements
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        D04P0902 stack = new D04P0902();
 
        // Push elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);
 
        // Display the stack elements
        System.out.print("The elements of the stack are: ");
        stack.display();
 
        // Pop two elements
        stack.pop();
        stack.pop();
 
        // Display the stack after two pops
        System.out.print("After popping twice: ");
        stack.display();
    }
}