package com.learning.core.day4session1;

public class D04P0905 {
    private Node front, rear; // Front and rear of the queue
    private int size; // Number of elements in the queue
 
    // Node class for Linked list
    private class Node {
        int data;
        Node next;
 
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
 
    public D04P0905() {
        front = null;
        rear = null;
        size = 0;
    }
 
    // Method to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
 
    // Method to remove an element from the queue
    public void dequeue() {
        if (front == null) {
            return;
        }
        Node temp = front;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        size--;
    }
 
    // Method to display the elements of the queue
    public void displayQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        D04P0905 queue = new D04P0905();
 
        // Enqueue elements
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
 
        System.out.print("Elements in queue: ");
        queue.displayQueue();
 
        // Dequeue (remove) two elements
        queue.dequeue();
        queue.dequeue();
 
        System.out.print("After removing two elements: ");
        queue.displayQueue();
    }
}