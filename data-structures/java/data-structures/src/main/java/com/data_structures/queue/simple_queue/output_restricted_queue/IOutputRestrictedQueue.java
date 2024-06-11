package com.data_structures.queue.simple_queue.output_restricted_queue;

interface IOutputRestrictedQueue<Element> {
    void frontEnqueue(Element element) throws Exception;

    void rearEnqueue(Element element) throws Exception;
    
    void frontDequeue() throws Exception;

    void print();
}