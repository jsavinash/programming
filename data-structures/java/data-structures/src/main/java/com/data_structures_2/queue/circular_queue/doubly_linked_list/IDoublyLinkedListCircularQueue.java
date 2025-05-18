package com.data_structures_2.queue.circular_queue.doubly_linked_list;

public interface IDoublyLinkedListCircularQueue<T> {

    void rearEnqueue(T data) throws Exception;

    void rearDequeue() throws Exception;

    void printQueue() throws Exception;

}
