package com.data_structures_2.queue.circular_queue.singly_linked_list;

import com.data_structures_2.list.singly_linked_list.ISinglyLinkedListNode;
import com.data_structures_2.list.singly_linked_list.SinglyLinkedListNode;

public class SinglyLinkedListCircularQueue<T> implements ISinglyLinkedListCircularQueue<T> {
    private ISinglyLinkedListNode<T> front = null;
    private ISinglyLinkedListNode<T> rear = null;
    private Integer maxNodeCount = 0;
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
        if (this.currentNodeCount < this.maxNodeCount) {
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
            this.rear.setNext(newNode);
            this.rear = newNode;
            this.front.setNext(newNode);
        }
        this.currentNodeCount++;
    }

    @Override
    public void rearDequeue() throws Exception {
        this.isQueueEmpty();
        this.currentNodeCount--;
    }

    @Override
    public void printQueue() throws Exception {

    }

    public static void main(String args[]) {
        SinglyLinkedListCircularQueue obj = new SinglyLinkedListCircularQueue(5);
    }
}
