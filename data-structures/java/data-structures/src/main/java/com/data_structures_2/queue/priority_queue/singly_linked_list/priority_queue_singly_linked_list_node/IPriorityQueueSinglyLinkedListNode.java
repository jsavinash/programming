package com.data_structures_2.queue.priority_queue.singly_linked_list.priority_queue_singly_linked_list_node;

public interface IPriorityQueueSinglyLinkedListNode<T> {
    void setNext(IPriorityQueueSinglyLinkedListNode<T> next);

    IPriorityQueueSinglyLinkedListNode<T> getNext();

    void setData(T data);

    T getData();

    void setPriority(Integer priority);

    Integer getPriority();
}
