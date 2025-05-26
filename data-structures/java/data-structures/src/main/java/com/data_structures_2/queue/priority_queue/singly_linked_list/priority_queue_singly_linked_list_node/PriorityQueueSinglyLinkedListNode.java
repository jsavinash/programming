package com.data_structures_2.queue.priority_queue.singly_linked_list.priority_queue_singly_linked_list_node;

public class PriorityQueueSinglyLinkedListNode<T> implements IPriorityQueueSinglyLinkedListNode<T> {

    private T data;
    private Integer priority;
    private IPriorityQueueSinglyLinkedListNode<T> next;

    public PriorityQueueSinglyLinkedListNode(T data, Integer priority) {
        this.data = data;
        this.priority = priority;
    }

    @Override
    public void setNext(IPriorityQueueSinglyLinkedListNode<T> next) {
        this.next = next;
    }

    @Override
    public IPriorityQueueSinglyLinkedListNode<T> getNext() {
        return this.next;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }
}
