package com.data_structures_2.queue.simple_queue.output_restricted_queue.doubly_linked_list;

import com.data_structures_2.list.doubly_linked_list.DoublyLinkedListNode;
import com.data_structures_2.list.doubly_linked_list.IDoublyLinkedListNode;

public class DoublyLinkedListOutputRestrictedQueue<T> implements IDoublyLinkedListOutputRestrictedQueue<T> {
    private IDoublyLinkedListNode<T> front = null;
    private IDoublyLinkedListNode<T> rear = null;
    private Integer nodeCount = 0;
    private Integer currentNodeCount = 0;

    DoublyLinkedListOutputRestrictedQueue(Integer capacity) {
        this.nodeCount = capacity;
        this.currentNodeCount = 0;
    }

    private void isQueueEmpty() throws Exception {
        if (this.currentNodeCount == 0) {
            throw new Exception("Queue is empty");
        }
    }


    private void isQueueFull() throws Exception {
        if (this.currentNodeCount >= this.nodeCount) {
            throw new Exception("Queue is full");
        }
    }

    @Override
    public void rearEnqueue(T data) throws Exception {
        this.isQueueFull();
        IDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            newNode.setPrev(this.rear);
            this.rear.setNext(newNode);
            this.rear = newNode;
        }
        this.currentNodeCount++;

    }

    @Override
    public void frontEnqueue(T data) throws Exception {
        this.isQueueFull();
        IDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            newNode.setNext(this.front);
            this.front.setPrev(newNode);
            this.front = newNode;
        }
        this.currentNodeCount++;
    }

    @Override
    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        if (this.front.getNext() != null) {
            this.front = this.front.getNext();
            this.front.setPrev(null);
            this.currentNodeCount--;
        }
    }

    @Override
    public void printQueue() {
        IDoublyLinkedListNode<T> tempNode = this.front;
        while (tempNode != null) {
            System.out.print(tempNode.getData() + " <=> ");
            tempNode = tempNode.getNext();
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        DoublyLinkedListOutputRestrictedQueue<Integer> obj = new DoublyLinkedListOutputRestrictedQueue<>(5);
        try {
            obj.frontEnqueue(1);
            obj.frontEnqueue(2);
            obj.printQueue();
            obj.rearEnqueue(3);
            obj.rearEnqueue(4);
            obj.printQueue();
            obj.frontDequeue();
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
