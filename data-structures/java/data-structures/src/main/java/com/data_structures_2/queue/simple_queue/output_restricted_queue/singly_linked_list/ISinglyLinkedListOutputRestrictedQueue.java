package com.data_structures_2.queue.simple_queue.output_restricted_queue.doubly_linked_list;

public interface IDoublyLinkedListOutputRestrictedQueue<T> {
    boolean isEmpty();

    void frontDequeue(T data) throws Exception;

    void rearEnqueue() throws Exception;

    void frontEnqueue() throws Exception;
}
