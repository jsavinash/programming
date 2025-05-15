package com.data_structures_2.queue.simple_queue.output_restricted_queue.singly_linked_list;

public interface ISinglyLinkedListOutputRestrictedQueue<T> {
    void frontDequeue() throws Exception;

    void rearEnqueue(T data) throws Exception;

    void frontEnqueue(T data) throws Exception;

    void printQueue();
}
