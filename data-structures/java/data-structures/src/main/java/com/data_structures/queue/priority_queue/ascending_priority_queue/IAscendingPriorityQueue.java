package com.data_structures.queue.priority_queue.ascending_priority_queue;

interface IAscendingPriorityQueue<Element> {
    void frontEnqueue(Element element, int priority) throws Exception;

    void rearEnqueue(Element element, int priority) throws Exception;

    void rearDequeue() throws Exception;

    void frontDequeue() throws Exception;

    void sortAscending();

    void print();
}