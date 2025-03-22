package com.data_structures.list.linked_list.circular_linked_list;

class CircularLinkedListNode<Item> {
    private Item data;
    private CircularLinkedListNode next;
    private CircularLinkedListNode prev;


    CircularLinkedListNode(Item data, CircularLinkedListNode prev, CircularLinkedListNode next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Constructor
     *
     * @param value Value to be put in the node
     */
    CircularLinkedListNode(Item value) {
        this(value, null, null);
    }

    public CircularLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(CircularLinkedListNode prev) {
        this.prev = prev;
    }


    public CircularLinkedListNode getNext() {
        return next;
    }

    public void setNext(CircularLinkedListNode next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }
}