package com.data_structures.queue.priority_queue.descending_priority_queue;

class DescendingPriorityQueue<Element> implements IDescendingPriorityQueue<Element> {
    public DescendingPriorityQueueNode<Element> front;
    public DescendingPriorityQueueNode<Element> rear;
    public int size;
    public int capacity;

    DescendingPriorityQueue(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public void frontEnqueue(Element element, int priority) throws Exception {
        if (this.size == this.capacity) {
            throw new Exception("Capacity limit exceed");
        }

        DescendingPriorityQueueNode<Element> newNode = new DescendingPriorityQueueNode(element, priority);
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

        DescendingPriorityQueueNode<Element> newNode = new DescendingPriorityQueueNode(element, priority);
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

    public void sortDescending() {
        DescendingPriorityQueueNode current = null, index = null;
        if (front == null) {
            return;
        }
        for (current = front; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.priority < index.priority) {
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
        DescendingPriorityQueueNode<Element> current = this.front;
        System.out.print("Front :: ");
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println(" :: Rear");
    }

    public static void main(String[] args) {
        DescendingPriorityQueue<String> descendingPriorityQueue = new DescendingPriorityQueue<String>(5);
        try {
            descendingPriorityQueue.rearEnqueue("Data 1", 9);
            descendingPriorityQueue.rearEnqueue("Data 2", 1);
            descendingPriorityQueue.rearEnqueue("Data 3", 7);
            descendingPriorityQueue.rearEnqueue("Data 4", 3);
            descendingPriorityQueue.frontEnqueue("Data 5", 2);
            descendingPriorityQueue.sortDescending();
            descendingPriorityQueue.print();
            descendingPriorityQueue.frontDequeue();
            descendingPriorityQueue.print();
            descendingPriorityQueue.rearDequeue();
            descendingPriorityQueue.print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}