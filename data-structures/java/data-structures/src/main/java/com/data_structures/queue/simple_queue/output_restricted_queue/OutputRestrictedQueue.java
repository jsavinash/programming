package com.data_structures.queue.simple_queue.output_restricted_queue;


class OutputRestrictedQueue<Element> implements IOutputRestrictedQueue<Element> {
    public OutputRestrictedQueueNode<Element> front;
    public OutputRestrictedQueueNode<Element> rear;
    public int size;
    public int capacity;

    OutputRestrictedQueue(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void frontEnqueue(Element element) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        OutputRestrictedQueueNode<Element> newNode = new OutputRestrictedQueueNode(element);
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

        OutputRestrictedQueueNode<Element> newNode = new OutputRestrictedQueueNode(element);
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


    public void frontDequeue() throws Exception {
        this.front = this.front.next;
        this.size--;
    }

    public void print() {
        OutputRestrictedQueueNode<Element> current = this.front;
        System.out.print("Front :: ");
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println(" :: Rear");
    }

    public static void main(String[] args) {
        OutputRestrictedQueue<String> outputRestrictedQueue = new OutputRestrictedQueue<String>(5);
        try {
            outputRestrictedQueue.rearEnqueue("Data 1");
            outputRestrictedQueue.rearEnqueue("Data 2");
            outputRestrictedQueue.rearEnqueue("Data 3");
            outputRestrictedQueue.rearEnqueue("Data 4");
            outputRestrictedQueue.frontEnqueue("Data 5");
            outputRestrictedQueue.print();
            outputRestrictedQueue.frontDequeue();
            outputRestrictedQueue.print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}