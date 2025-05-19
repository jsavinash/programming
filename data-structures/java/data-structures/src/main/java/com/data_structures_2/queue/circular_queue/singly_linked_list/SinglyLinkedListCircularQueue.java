package com.data_structures_2.queue.circular_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;

public class SinglyLinkedListCircularQueue<T> implements ISinglyLinkedListCircularQueue<T> {
    private ISinglyLinkedListNode<T> front = null;
    private ISinglyLinkedListNode<T> rear = null;
    private Integer maxNodeCount;
    private Integer currentNodeCount = 0;

    SinglyLinkedListCircularQueue(Integer maxNodeCount) {
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
        ISinglyLinkedListNode<T> newNode = new SinglyLinkedListNode(data);
        if (this.front == null && this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            newNode.setNext(this.rear);
            this.rear = newNode;
            this.front.setNext(newNode);
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
    public void printQueue() throws Exception {
        this.isQueueEmpty();
        ISinglyLinkedListNode<T> rearRef = this.rear;
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
        SinglyLinkedListCircularQueue<Integer> obj = new SinglyLinkedListCircularQueue<Integer>(5);
        try {
            System.out.println("***************** Singly Linked List Circular Queue *****************");
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
