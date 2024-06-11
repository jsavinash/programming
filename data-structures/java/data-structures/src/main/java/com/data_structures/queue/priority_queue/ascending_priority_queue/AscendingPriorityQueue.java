package com.data_structures.queue.priority_queue.ascending_priority_queue;

class AscendingPriorityQueue<Element> implements IAscendingPriorityQueue<Element> {
    public AscendingPriorityQueueNode<Element> front;
    public AscendingPriorityQueueNode<Element> rear;
    public int size;
    public int capacity;

    AscendingPriorityQueue(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void frontEnqueue(Element element, int priority) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        AscendingPriorityQueueNode<Element> newNode = new AscendingPriorityQueueNode(element, priority);
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

    public void rearEnqueue(Element element, int priority) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        AscendingPriorityQueueNode<Element> newNode = new AscendingPriorityQueueNode(element, priority);
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

    public void sortAscending() {
        AscendingPriorityQueueNode current = null, index = null;
        if (front == null) {
            return;
        }
        for (current = front; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.priority > index.priority) {
                    Element tempData = (Element) current.data;
                    int tempPriority = current.priority;
                    current.data = index.data;
                    current.priority = index.priority;
                    index.data = tempData;
                    index.priority = tempPriority;
                }
            }
        }
    }

    public void print() {
        AscendingPriorityQueueNode<Element> current = this.front;
        System.out.print("Front :: ");
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println(" :: Rear");
    }

    public static void main(String[] args) {
        AscendingPriorityQueue<String> ascendingPriorityQueue = new AscendingPriorityQueue<String>(5);
        try {
            ascendingPriorityQueue.rearEnqueue("Data 1", 3);
            ascendingPriorityQueue.rearEnqueue("Data 2", 6);
            ascendingPriorityQueue.rearEnqueue("Data 3", 9);
            ascendingPriorityQueue.frontEnqueue("Data 4", 1);
            ascendingPriorityQueue.sortAscending();
            ascendingPriorityQueue.print();
            ascendingPriorityQueue.frontDequeue();
            ascendingPriorityQueue.print();
            ascendingPriorityQueue.rearDequeue();
            ascendingPriorityQueue.print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}