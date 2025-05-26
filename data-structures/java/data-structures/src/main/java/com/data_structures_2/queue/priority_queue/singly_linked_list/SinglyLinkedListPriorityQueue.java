package com.data_structures_2.queue.priority_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;

public class SinglyLinkedListPriorityQueue<T> implements ISinglyLinkedListPriorityQueue<T> {
    private ISinglyLinkedListNode<T> front = null;
    private ISinglyLinkedListNode<T> rear = null;
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

    @Override
    public void frontEnqueue(T data) throws Exception {
        this.isQueueFull();
        ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        if (this.front == null && this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.front.setNext(newNode);
            this.front = newNode;
        }
        this.currentNodeCount++;
    }

    @Override
    public void rearEnqueue(T data) throws Exception {
        this.isQueueFull();
        ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
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
        ISinglyLinkedListNode<T> rearRef = this.rear;
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
        SinglyLinkedListPriorityQueue<Integer> obj = new SinglyLinkedListPriorityQueue(5);
        try {
            obj.rearEnqueue(1);
            obj.frontEnqueue(2);
            obj.rearEnqueue(3);
            obj.frontEnqueue(4);
            obj.rearEnqueue(5);
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
