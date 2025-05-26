package com.data_structures_2.queue.priority_queue.singly_linked_list;

public interface ISinglyLinkedListPriorityQueue<T> {
    void printQueue() throws Exception;

    void frontEnqueue(T data) throws Exception;

    void rearEnqueue(T data) throws Exception;

    void frontDequeue() throws Exception;

    void rearDequeue() throws Exception;
}
