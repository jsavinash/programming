package com.data_structures_2.queue.circular_queue.doubly_linked_list;

import com.data_structures_2.list.doubly_linked_list.DoublyLinkedListNode;
import com.data_structures_2.list.doubly_linked_list.IDoublyLinkedListNode;

public class DoublyLinkedListCircularQueue<T> implements IDoublyLinkedListCircularQueue<T> {
    private IDoublyLinkedListNode<T> front = null;
    private IDoublyLinkedListNode<T> rear = null;
    private Integer maxNodeCount;
    private Integer currentNodeCount = 0;

    DoublyLinkedListCircularQueue(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    private void isQueueEmpty() throws Exception {
        if (this.currentNodeCount == 0) {
            throw new Exception("Queue is Empty");
        }
    }

    private void isQueueFull() throws Exception {
        if (this.currentNodeCount >= this.maxNodeCount) {
            throw new Exception("Queue is Full");
        }
    }

    @Override
    public void rearEnqueue(T data) throws Exception {
        this.isQueueFull();
        IDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        if (this.front == null && this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            newNode.setNext(this.rear);
            this.rear.setPrev(newNode);
            this.rear = newNode;
            newNode.setPrev(this.front);
            this.front.setNext(newNode);
        }
        this.currentNodeCount++;
    }

    @Override
    public void rearDequeue() throws Exception {
        this.isQueueEmpty();
        IDoublyLinkedListNode<T> nextNode = this.rear.getNext();
        nextNode.setPrev(this.front);
        this.rear = nextNode;
        this.currentNodeCount--;
    }

    @Override
    public void printQueue() throws Exception {
        this.isQueueEmpty();
        IDoublyLinkedListNode<T> rearRef = this.rear;
        StringBuffer sb = new StringBuffer();
        while (rearRef != null) {
            sb.append(rearRef.getData() + " =< ");
            if (rearRef == this.front) {
                rearRef = null;
            } else {
                rearRef = rearRef.getNext();
            }
        }
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String args[]) {
        DoublyLinkedListCircularQueue<Integer> obj = new DoublyLinkedListCircularQueue<Integer>(5);
        try {
            System.out.println("***************** Doubly Linked List Circular Queue *****************");
            obj.rearEnqueue(1);
            obj.rearEnqueue(2);
            obj.rearEnqueue(3);
            obj.rearEnqueue(4);
            obj.rearEnqueue(5);
            obj.printQueue();
            obj.rearDequeue();
            obj.printQueue();
            obj.rearDequeue();
            obj.printQueue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
