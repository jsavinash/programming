package com.data_structures_2.queue.simple_queue.input_restricted_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;

public class SinglyLinkedListInputRestrictedQueue<T> implements ISinglyLinkedListInputRestrictedQueue<T> {
    ISinglyLinkedListNode<T> front = null;
    ISinglyLinkedListNode<T> rear = null;
    int maxCounter;
    int currentCounter;

    SinglyLinkedListInputRestrictedQueue(int data) {
        this.maxCounter = data;
        this.currentCounter = 0;
    }

    public void rearEnqueue(T data) throws Exception {
        if (this.currentCounter < this.maxCounter) {
            SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
            if (this.rear == null && this.front == null) {
                this.rear = this.front = newNode;
            } else {
                newNode.setNext(this.rear);
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
        this.currentCounter--;
    }

    String print() {
        ISinglyLinkedListNode<T> tempNode = this.rear;
        StringBuffer str = new StringBuffer();
        while (tempNode != null) {
            str.append(" =< " + tempNode.getData());
            tempNode = tempNode.getNext();
        }
        str = str.reverse();
        return str.toString();
    }

    public static void main(String args[]) {
        SinglyLinkedListInputRestrictedQueue<Integer> obj = new SinglyLinkedListInputRestrictedQueue<Integer>(5);
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
            obj.frontDequeue();
            obj.frontDequeue();
            obj.frontDequeue();
            System.out.println(obj.print());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
