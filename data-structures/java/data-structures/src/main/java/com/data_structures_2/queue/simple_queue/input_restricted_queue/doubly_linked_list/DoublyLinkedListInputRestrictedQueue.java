package com.data_structures_2.queue.simple_queue.input_restricted_queue.doubly_linked_list;

import com.data_structures_2.list.doubly_linked_list.DoublyLinkedListNode;
import com.data_structures_2.list.doubly_linked_list.IDoublyLinkedListNode;

public class DoublyLinkedListInputRestrictedQueue<T> implements IDoublyLinkedListInputRestrictedQueue<T> {
    IDoublyLinkedListNode<T> front = null;
    IDoublyLinkedListNode<T> rear = null;
    int maxCounter;
    int currentCounter;

    DoublyLinkedListInputRestrictedQueue(int data) {
        this.maxCounter = data;
        this.currentCounter = 0;
    }

    public void rearEnqueue(T data) throws Exception {
        if (this.currentCounter < this.maxCounter) {
            DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
            if (this.rear == null && this.front == null) {
                this.rear = this.front = newNode;
            } else {
                newNode.setNext(this.rear);
                this.rear.setPrev(newNode);
                this.rear = newNode;
            }
            this.currentCounter++;
        } else {
            throw new Exception("Queue is full");
        }
    }

    public boolean isEmpty() {
        return this.currentCounter == 0;
    }

    public void rearDequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is empty");
        }
        this.rear = this.rear.getNext();
        this.currentCounter--;
    }

    public void frontDequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is empty");
        }
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
        this.currentCounter--;
    }

    String print() {
        IDoublyLinkedListNode<T> tempNode = this.rear;
        StringBuffer str = new StringBuffer();
        while (tempNode != null) {
            str.append(" =< " + tempNode.getData());
            tempNode = tempNode.getNext();
        }
        str = str.reverse();
        return str.toString();
    }

    public static void main(String args[]) {
        DoublyLinkedListInputRestrictedQueue<Integer> obj = new DoublyLinkedListInputRestrictedQueue<Integer>(5);
        try {
            obj.rearEnqueue(1);
            obj.rearEnqueue(2);
            obj.rearEnqueue(3);
            obj.rearEnqueue(4);
            obj.rearEnqueue(5);
            System.out.println(obj.print());
            obj.rearDequeue();
            System.out.println(obj.print());
            obj.frontDequeue();
            System.out.println(obj.print());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
