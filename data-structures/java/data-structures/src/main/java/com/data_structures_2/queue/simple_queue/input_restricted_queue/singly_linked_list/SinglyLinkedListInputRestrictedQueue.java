package com.data_structures_2.queue.simple_queue.input_restricted_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;

public class SinglyLinkedListInputRestrictedQueue<T> implements ISinglyLinkedListInputRestrictedQueue<T> {
    ISinglyLinkedListNode<T> front = null;
    ISinglyLinkedListNode<T> rear = null;
    private Integer maxNodeCount = 0;
    private Integer currentNodeCount = 0;

    SinglyLinkedListInputRestrictedQueue(int data) {
        this.maxNodeCount = data;
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

    @Override
    public void rearEnqueue(T data) throws Exception {
        this.isQueueFull();
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            newNode.setNext(this.rear);
            this.rear = newNode;
        }
        this.currentNodeCount++;

    }

    @Override
    public void rearDequeue() throws Exception {
        this.isQueueEmpty();
        this.rear = this.rear.getNext();
        this.currentNodeCount--;
    }

    @Override
    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        ISinglyLinkedListNode<T> tempNode = this.rear;
        ISinglyLinkedListNode<T> newRear = null;
        ISinglyLinkedListNode<T> newRearRef = null;
        while (tempNode.getNext() != null) {
            ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(tempNode.getData());
            if (newRear == null) {
                newRearRef = newRear = newNode;
            } else {
                newRear.setNext(newNode);
                newRear = newNode;
            }
            tempNode = tempNode.getNext();
        }
        this.rear = newRearRef;
        this.currentNodeCount--;
    }

    @Override
    public void printQueue() {
        ISinglyLinkedListNode<T> tempNode = this.rear;
        StringBuffer str = new StringBuffer();
        while (tempNode != null) {
            str.append(" =< " + tempNode.getData());
            tempNode = tempNode.getNext();
        }
        str = str.reverse();
        System.out.println(str.toString());
    }

    public static void main(String args[]) {
        System.out.println("***************** Singly Linked List Input Restricted Queue *****************");
        SinglyLinkedListInputRestrictedQueue<Integer> obj = new SinglyLinkedListInputRestrictedQueue<Integer>(5);
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
            obj.frontDequeue();
            obj.frontDequeue();
            obj.frontDequeue();
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
