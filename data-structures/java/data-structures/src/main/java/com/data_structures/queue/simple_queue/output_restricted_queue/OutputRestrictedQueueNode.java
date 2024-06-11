package com.data_structures.queue.simple_queue.output_restricted_queue;

class OutputRestrictedQueueNode<Element> {
    public Element data;
    public OutputRestrictedQueueNode<Element> next;
    public OutputRestrictedQueueNode<Element> prev;

    OutputRestrictedQueueNode(Element data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    OutputRestrictedQueueNode(Element data, OutputRestrictedQueueNode<Element> next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    OutputRestrictedQueueNode(Element data, OutputRestrictedQueueNode<Element> next, OutputRestrictedQueueNode<Element> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}