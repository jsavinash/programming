package com.data_structures.queue.double_ended_queue;

class DoubleEndedQueueNode<Element> {
    public Element data;
    public DoubleEndedQueueNode<Element> next;
    public DoubleEndedQueueNode<Element> prev;

    DoubleEndedQueueNode(Element data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    DoubleEndedQueueNode(Element data, DoubleEndedQueueNode<Element> next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    DoubleEndedQueueNode(Element data, DoubleEndedQueueNode<Element> next, DoubleEndedQueueNode<Element> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}