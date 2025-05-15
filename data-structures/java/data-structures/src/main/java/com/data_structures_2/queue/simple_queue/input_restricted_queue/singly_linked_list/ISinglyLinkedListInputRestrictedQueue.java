package com.data_structures_2.queue.simple_queue.input_restricted_queue.singly_linked_list;

public interface ISinglyLinkedListInputRestrictedQueue<T> {

    void rearEnqueue(T data) throws Exception;

    void rearDequeue() throws Exception;

    void frontDequeue() throws Exception;

    void printQueue() throws Exception;
}
