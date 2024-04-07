package com.learning.core.day4session1;

public class D04P0906 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
 
    // Constructor to initialize the queue
    public D04P0906(int capacity) {
        this.capacity = capacity;
        queue = new int[this.capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
 
    // Function to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }
 
    // Function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
 
    // Function to check if the queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }
 
    // Function to check if the queue is full
    public boolean isFull() {
        return (size == capacity);
    }
 
    // Function to display the elements of the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        for (int s = 0; s < size; s++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        D04P0906 circularQueue = new D04P0906(4); // Initialize circular queue with capacity 4
 
        // Enqueue elements
        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);
        circularQueue.enqueue(-8);
 
        System.out.print("Elements in circular queue: ");
        circularQueue.displayQueue();
 
        // Dequeue (remove) first element
        circularQueue.dequeue();
 
        System.out.print("After removing first element: ");
        circularQueue.displayQueue();
    }
}