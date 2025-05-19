package com.data_structures_2.queue.double_ended_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;

public class SinglyLinkedListDoubleEndedQueue<T> implements ISinglyLinkedListDoubleEndedQueue<T> {
    private ISinglyLinkedListNode<T> front = null;
    private ISinglyLinkedListNode<T> rear = null;
    private Integer maxNodeCount;
    private Integer currentNodeCount = 0;

    SinglyLinkedListDoubleEndedQueue(Integer maxNodeCount) {
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

    public void rearDequeue() throws Exception {
        this.isQueueEmpty();
        this.rear = this.rear.getNext();
        this.currentNodeCount--;
    }

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

    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        ISinglyLinkedListNode<T> rearRef = this.rear;
        while (rearRef.getNext() != this.front) {
            rearRef = rearRef.getNext();
        }
        rearRef.setNext(null);
        this.front = rearRef;
        this.currentNodeCount--;
    }

    public void printQueue() throws Exception {
        this.isQueueEmpty();
        ISinglyLinkedListNode<T> rearRef = this.rear;
        StringBuffer sb = new StringBuffer();
        while (rearRef != null) {
            sb.append(rearRef.getData() + " =< ");
            rearRef = rearRef.getNext();
        }
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String args[]) {
        System.out.println("***************** Singly Linked List Double Ended Queue *****************");
        SinglyLinkedListDoubleEndedQueue<Integer> obj = new SinglyLinkedListDoubleEndedQueue(5);
        try {
            obj.rearEnqueue(1);
            obj.rearEnqueue(2);
            obj.printQueue();
            obj.rearEnqueue(3);
            obj.printQueue();
            obj.frontEnqueue(4);
            obj.frontEnqueue(5);
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
