package com.data_structures.queue.priority_queue.ascending_priority_queue;

class AscendingPriorityQueueNode<Element> {
    public Element data;
    public int priority;
    public AscendingPriorityQueueNode<Element> next;
    public AscendingPriorityQueueNode<Element> prev;

    AscendingPriorityQueueNode(Element data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
        this.prev = null;
    }
}