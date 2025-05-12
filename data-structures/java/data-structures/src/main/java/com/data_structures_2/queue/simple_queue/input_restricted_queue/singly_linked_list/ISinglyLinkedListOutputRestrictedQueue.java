package com.data_structures_2.queue.simple_queue.input_restricted_queue.singly_linked_list;

public interface ISinglyLinkedListOutputRestrictedQueue<T> {
    boolean isEmpty();
    void rearEnqueue(T data) throws Exception;
    void rearDequeue() throws Exception;
    void frontDequeue() throws Exception;
}
