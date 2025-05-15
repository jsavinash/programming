package com.data_structures_2.queue.simple_queue.input_restricted_queue.doubly_linked_list;

import com.data_structures_2.list.doubly_linked_list.DoublyLinkedListNode;
import com.data_structures_2.list.doubly_linked_list.IDoublyLinkedListNode;

public class DoublyLinkedListInputRestrictedQueue<T> implements IDoublyLinkedListInputRestrictedQueue<T> {
    IDoublyLinkedListNode<T> front = null;
    IDoublyLinkedListNode<T> rear = null;
    private Integer maxNodeCount = 0;
    private Integer currentNodeCount = 0;


    DoublyLinkedListInputRestrictedQueue(int data) {
        this.maxNodeCount = data;
        this.currentNodeCount = 0;
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

    public void rearEnqueue(T data) throws Exception {
        this.isQueueFull();
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            newNode.setNext(this.rear);
            this.rear.setPrev(newNode);
            this.rear = newNode;
        }
        this.currentNodeCount++;
    }


    public void rearDequeue() throws Exception {
        this.isQueueEmpty();
        this.rear = this.rear.getNext();
        this.currentNodeCount--;
    }

    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        IDoublyLinkedListNode<T> tempNode = this.rear;
        IDoublyLinkedListNode<T> newRear = null;
        IDoublyLinkedListNode<T> newRearRef = null;
        while (tempNode.getNext() != null) {
            IDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(tempNode.getData());
            if (newRear == null) {
                newRearRef = newRear = newNode;
            } else {
                newNode.setPrev(this.rear);
                newRear.setNext(newNode);
                newRear = newNode;
            }
            tempNode = tempNode.getNext();
        }
        this.rear = newRearRef;
        this.currentNodeCount--;
    }

    public void printQueue() {
        IDoublyLinkedListNode<T> tempNode = this.rear;
        StringBuffer str = new StringBuffer();
        while (tempNode != null) {
            str.append(" =< " + tempNode.getData());
            tempNode = tempNode.getNext();
        }
        str = str.reverse();
        System.out.println(str.toString());
    }

    public static void main(String args[]) {
        DoublyLinkedListInputRestrictedQueue<Integer> obj = new DoublyLinkedListInputRestrictedQueue<Integer>(5);
        try {
            obj.rearEnqueue(1);
            obj.rearEnqueue(2);
            obj.rearEnqueue(3);
            obj.rearEnqueue(4);
            obj.rearEnqueue(5);
            obj.printQueue();
            obj.rearDequeue();
            obj.printQueue();
            obj.frontDequeue();
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
