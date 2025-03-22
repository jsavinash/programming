package com.data_structures.queue.double_ended_queue;

class DoubleEndedQueue<Element> implements IDoubleEndedQueue<Element> {
    public DoubleEndedQueueNode<Element> front;
    public DoubleEndedQueueNode<Element> rear;
    public int size;
    public int capacity;

    DoubleEndedQueue(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void frontEnqueue(Element element) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        DoubleEndedQueueNode<Element> newNode = new DoubleEndedQueueNode(element);
        if (this.front == null && this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            newNode.next = this.front;
            this.front.prev = newNode;
            this.front = newNode;
        }
        size++;
    }

    public void rearEnqueue(Element element) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        DoubleEndedQueueNode<Element> newNode = new DoubleEndedQueueNode(element);
        if (this.front == null && this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            newNode.prev = this.rear;
            this.rear.next = newNode;
            this.rear = newNode;
        }
        size++;
    }

    public void rearDequeue() throws Exception {
        this.rear = this.rear.prev;
        this.rear.next = null;
        this.size--;
    }

    public void frontDequeue() throws Exception {
        this.front = this.front.next;
        this.size--;
    }

    public void print() {
        DoubleEndedQueueNode<Element> current = this.front;
        System.out.print("Front :: ");
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println(" :: Rear");
    }

    public static void main(String[] args) {
        DoubleEndedQueue<String> doubleEndedQueue = new DoubleEndedQueue<String>(5);
        try {
            doubleEndedQueue.rearEnqueue("Data 1");
            doubleEndedQueue.rearEnqueue("Data 2");
            doubleEndedQueue.rearEnqueue("Data 3");
            doubleEndedQueue.rearEnqueue("Data 4");
            doubleEndedQueue.frontEnqueue("Data 5");
            doubleEndedQueue.print();
            doubleEndedQueue.frontDequeue();
            doubleEndedQueue.print();
            doubleEndedQueue.rearDequeue();
            doubleEndedQueue.print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}