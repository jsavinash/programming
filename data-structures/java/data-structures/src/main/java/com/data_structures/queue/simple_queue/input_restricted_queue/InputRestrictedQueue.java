package com.data_structures.queue.simple_queue.input_restricted_queue;

class InputRestrictedQueue<Element> implements IInputRestrictedQueue<Element> {
    public InputRestrictedQueueNode<Element> front;
    public InputRestrictedQueueNode<Element> rear;
    public int size;
    public int capacity;

    InputRestrictedQueue(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void rearEnqueue(Element element) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        InputRestrictedQueueNode<Element> newNode = new InputRestrictedQueueNode(element);
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
        InputRestrictedQueueNode<Element> current = this.front;
        System.out.print("Front :: ");
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println(" :: Rear");
    }

    public static void main(String[] args) {
        InputRestrictedQueue<String> inputRestrictedQueue = new InputRestrictedQueue<String>(5);
        try {
            inputRestrictedQueue.rearEnqueue("Data 1");
            inputRestrictedQueue.rearEnqueue("Data 2");
            inputRestrictedQueue.rearEnqueue("Data 3");
            inputRestrictedQueue.rearEnqueue("Data 4");
            inputRestrictedQueue.rearEnqueue("Data 5");
            inputRestrictedQueue.print();
            inputRestrictedQueue.frontDequeue();
            inputRestrictedQueue.print();
            inputRestrictedQueue.rearDequeue();
            inputRestrictedQueue.print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}