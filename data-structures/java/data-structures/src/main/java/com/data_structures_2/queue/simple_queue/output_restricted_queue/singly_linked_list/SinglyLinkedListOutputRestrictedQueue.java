package com.data_structures_2.queue.simple_queue.output_restricted_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;

public class SinglyLinkedListOutputRestrictedQueue<T> implements ISinglyLinkedListOutputRestrictedQueue<T> {
    private ISinglyLinkedListNode<T> front = null;
    private ISinglyLinkedListNode<T> rear = null;
    private Integer maxNodeCount = 0;
    private Integer currentNodeCount = 0;

    SinglyLinkedListOutputRestrictedQueue(Integer maxNodeCount) {
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

    @Override
    public void rearEnqueue(T data) throws Exception {
        this.isQueueFull();
        ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            newNode.setNext(this.rear);
            this.rear = newNode;
        }
        this.currentNodeCount++;
    }

    @Override
    public void frontEnqueue(T data) throws Exception {
        this.isQueueFull();
        ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            this.front.setNext(newNode);
            this.front = newNode;
        }
        this.currentNodeCount++;
    }

    @Override
    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        ISinglyLinkedListNode<T> tempNode = this.rear;
        ISinglyLinkedListNode<T> newRear = null;
        ISinglyLinkedListNode<T> newRearRef = null;
        ISinglyLinkedListNode<T> secondLastNode = null;
        while (tempNode.getNext() != null) {
            ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(tempNode.getData());
            if (newRear == null) {
                newRearRef = newRear = newNode;
            } else {
                newRear.setNext(newNode);
                newRear = newNode;
                secondLastNode = tempNode;
            }
            tempNode = tempNode.getNext();
        }
        this.front = secondLastNode;
        this.rear = newRearRef;
        this.currentNodeCount--;
    }

    @Override
    public void printQueue() {
        StringBuffer sb = new StringBuffer();
        ISinglyLinkedListNode<T> tempNode = this.rear;
        while (tempNode != null) {
            sb.append(tempNode.getData() + " =< ");
            tempNode = tempNode.getNext();
        }
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void main(String args[]) {
        SinglyLinkedListOutputRestrictedQueue<Integer> obj = new SinglyLinkedListOutputRestrictedQueue<>(5);
        try {
            obj.rearEnqueue(1);
            obj.rearEnqueue(2);
            obj.rearEnqueue(3);
            obj.rearEnqueue(4);
            obj.frontEnqueue(5);
            obj.printQueue();
            obj.frontDequeue();
            obj.printQueue();
            obj.frontDequeue();
            obj.frontDequeue();
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
