package com.data_structures_2.queue.priority_queue.singly_linked_list;

import com.data_structures_2.queue.priority_queue.singly_linked_list.priority_queue_singly_linked_list_node.IPriorityQueueSinglyLinkedListNode;
import com.data_structures_2.queue.priority_queue.singly_linked_list.priority_queue_singly_linked_list_node.PriorityQueueSinglyLinkedListNode;

public class SinglyLinkedListPriorityQueue<T> implements ISinglyLinkedListPriorityQueue<T> {
    private IPriorityQueueSinglyLinkedListNode<T> front = null;
    private IPriorityQueueSinglyLinkedListNode<T> rear = null;
    private Integer maxNodeCount;
    private Integer currentNodeCount = 0;

    SinglyLinkedListPriorityQueue(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    private void isQueueFull() throws Exception {
        if (this.currentNodeCount == this.maxNodeCount) {
            throw new Exception("Queue is full");
        }
    }

    private void isQueueEmpty() throws Exception {
        if (this.currentNodeCount == 0) {
            throw new Exception("Queue is empty");
        }
    }

    private void bubbleSort() {
        IPriorityQueueSinglyLinkedListNode<T> rearRef = this.rear;
        IPriorityQueueSinglyLinkedListNode<T> rearRef2 = this.rear;
        while (rearRef != null) {
            Integer digit = (Integer) rearRef.getData();
            while (rearRef2 != null) {
                Integer digit2 = (Integer) rearRef2.getData();
                if (digit > digit2){

                }
            }
        }
    }

    @Override
    public void frontEnqueue(T data, Integer priority) throws Exception {
        this.isQueueFull();
        IPriorityQueueSinglyLinkedListNode<T> newNode = new PriorityQueueSinglyLinkedListNode<>(data, priority);
        if (this.front == null && this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.front.setNext(newNode);
            this.front = newNode;
        }
        this.currentNodeCount++;
    }

    @Override
    public void rearEnqueue(T data, Integer priority) throws Exception {
        this.isQueueFull();
        IPriorityQueueSinglyLinkedListNode<T> newNode = new PriorityQueueSinglyLinkedListNode<>(data, priority);
        if (this.front == null && this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            newNode.setNext(this.rear);
            this.rear = newNode;
        }
        this.currentNodeCount++;
    }

    @Override
    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        IPriorityQueueSinglyLinkedListNode<T> rearRef = this.rear;
        while (rearRef.getNext() != null) {
            rearRef = rearRef.getNext();
        }
        rearRef.setNext(null);
        this.front = rearRef;
        this.currentNodeCount--;
    }

    @Override
    public void rearDequeue() throws Exception {
        this.isQueueEmpty();
        this.rear = this.rear.getNext();
        this.currentNodeCount--;
    }

    @Override
    public void printQueue() {
        IPriorityQueueSinglyLinkedListNode<T> rearRef = this.rear;
        StringBuffer sb = new StringBuffer();
        while (rearRef != null) {
            sb.append(rearRef.getData() + " =< ");
            rearRef = rearRef.getNext();
        }
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String args[]) {
        SinglyLinkedListPriorityQueue<Integer> obj = new SinglyLinkedListPriorityQueue(5);
        try {
            obj.rearEnqueue(10, 4);
            obj.rearEnqueue(11, 5);
            obj.rearEnqueue(12, 1);
            obj.rearEnqueue(13, 8);
            obj.rearEnqueue(14, 30);
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
