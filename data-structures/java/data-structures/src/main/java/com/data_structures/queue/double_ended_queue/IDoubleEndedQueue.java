package com.data_structures.queue.double_ended_queue;

interface IDoubleEndedQueue<Element> {
    void frontEnqueue(Element element) throws Exception;

    void rearEnqueue(Element element) throws Exception;

    void rearDequeue() throws Exception;

    void frontDequeue() throws Exception;

    void print();
}