package com.data_structures.queue.priority_queue.descending_priority_queue;

class DescendingPriorityQueueNode<Element> {
    public Element data;
    public int priority;
    public DescendingPriorityQueueNode<Element> next;
    public DescendingPriorityQueueNode<Element> prev;

    DescendingPriorityQueueNode(Element data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
        this.prev = null;
    }
}