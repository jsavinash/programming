package com.data_structures_2.queue.double_ended_queue.doubly_linked_list;

public interface IDoublyLinkedListDoubleEndedQueue<T> {
    void printQueue() throws Exception;

    void frontEnqueue(T data) throws Exception;

    void rearEnqueue(T data) throws Exception;

    void frontDequeue() throws Exception;

    void rearDequeue() throws Exception;
}
