package com.data_structures_2.queue.double_ended_queue.doubly_linked_list;

import com.data_structures_2.list.doubly_linked_list.DoublyLinkedListNode;
import com.data_structures_2.list.doubly_linked_list.IDoublyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;
import com.data_structures_2.queue.double_ended_queue.singly_linked_list.ISinglyLinkedListDoubleEndedQueue;

public class DoublyLinkedListDoubleEndedQueue<T> implements IDoublyLinkedListDoubleEndedQueue<T> {
    private IDoublyLinkedListNode<T> front = null;
    private IDoublyLinkedListNode<T> rear = null;
    private Integer maxNodeCount;
    private Integer currentNodeCount = 0;

    DoublyLinkedListDoubleEndedQueue(Integer maxNodeCount) {
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
        IDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
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
        this.rear.setPrev(null);
        this.currentNodeCount--;
    }

    public void frontEnqueue(T data) throws Exception {
        this.isQueueFull();
        IDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        if (this.rear == null && this.front == null) {
            this.rear = this.front = newNode;
        } else {
            newNode.setPrev(this.front);
            this.front.setNext(newNode);
            this.front = newNode;
        }
        this.currentNodeCount++;
    }

    public void frontDequeue() throws Exception {
        this.isQueueEmpty();
        this.front = this.front.getPrev();
        this.front.setNext(null);
        this.currentNodeCount--;
    }

    public void printQueue() throws Exception {
        this.isQueueEmpty();
        IDoublyLinkedListNode<T> rearRef = this.rear;
        StringBuffer sb = new StringBuffer();
        while (rearRef != null) {
            sb.append(rearRef.getData() + " =< ");
            rearRef = rearRef.getNext();
        }
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String args[]) {
        System.out.println("***************** Doubly Linked List Double Ended Queue *****************");
        DoublyLinkedListDoubleEndedQueue<Integer> obj = new DoublyLinkedListDoubleEndedQueue(5);
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
