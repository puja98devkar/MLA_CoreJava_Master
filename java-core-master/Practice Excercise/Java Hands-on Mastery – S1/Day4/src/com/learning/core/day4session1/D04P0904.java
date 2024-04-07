package com.learning.core.day4session1;

public class D04P0904 {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;
 
    // Constructor to initialize the queue
    public D04P0904(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
 
    // Function to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            count++;
        }
    }
 
    // Function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int item = queue[front];
            front = (front + 1) % capacity;
            count--;
            return item;
        }
    }
 
    // Function to check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }
 
    // Function to check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }
 
    // Function to display the elements of the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        D04P0904 queue = new D04P0904(4); // Initialize queue with capacity 4
 
        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
 
        System.out.print("Elements in queue: ");
        queue.displayQueue();
 
        // Dequeue (remove) first element
        queue.dequeue();
 
        System.out.print("After removing first element: ");
        queue.displayQueue();
    }
}