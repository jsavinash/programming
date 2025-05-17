package com.data_structures_2.queue.circular_queue.singly_linked_list;

public interface ISinglyLinkedListCircularQueue<T> {

    void rearEnqueue(T data) throws Exception;

    void rearDequeue() throws Exception;

    void printQueue() throws Exception;

}
