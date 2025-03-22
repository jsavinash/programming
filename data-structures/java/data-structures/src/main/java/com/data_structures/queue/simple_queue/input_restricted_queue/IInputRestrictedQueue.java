package com.data_structures.queue.simple_queue.input_restricted_queue;

interface IInputRestrictedQueue<Element> {
    void rearEnqueue(Element element) throws Exception;

    void rearDequeue() throws Exception;

    void frontDequeue() throws Exception;

    void print();
}