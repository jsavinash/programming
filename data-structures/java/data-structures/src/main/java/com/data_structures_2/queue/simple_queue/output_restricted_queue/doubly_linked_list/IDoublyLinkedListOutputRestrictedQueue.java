package com.data_structures_2.queue.simple_queue.output_restricted_queue.doubly_linked_list;

public interface IDoublyLinkedListOutpuRestrictedQueue<T> {
    boolean isEmpty();

    void rearEnqueue(T data) throws Exception;

    void rearDequeue() throws Exception;

    void frontDequeue() throws Exception;
}
