package com.data_structures.queue.priority_queue.descending_priority_queue;

interface IDescendingPriorityQueue<Element> {
    void frontEnqueue(Element element, int priority) throws Exception;

    void rearEnqueue(Element element, int priority) throws Exception;

    void rearDequeue() throws Exception;

    void frontDequeue() throws Exception;

    void sortDescending();

    void print();
}