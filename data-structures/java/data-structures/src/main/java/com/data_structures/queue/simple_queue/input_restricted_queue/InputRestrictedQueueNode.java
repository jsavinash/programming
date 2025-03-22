package com.data_structures.queue.simple_queue.input_restricted_queue;

class InputRestrictedQueueNode<Element> {
    public Element data;
    public InputRestrictedQueueNode<Element> next;
    public InputRestrictedQueueNode<Element> prev;

    InputRestrictedQueueNode(Element data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    InputRestrictedQueueNode(Element data, InputRestrictedQueueNode<Element> next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    InputRestrictedQueueNode(Element data, InputRestrictedQueueNode<Element> next, InputRestrictedQueueNode<Element> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}