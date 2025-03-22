package com.data_structures.list.linked_list.header_linked_list.circular_header_linked_list;

class CircularHeaderLinkedListNode<Item> {
    private Item data;
    private CircularHeaderLinkedListNode next;

    CircularHeaderLinkedListNode() {
    }

    CircularHeaderLinkedListNode(Item value, CircularHeaderLinkedListNode next) {
        data = value;
        next = next;
    }

    /**
     * Constructor
     *
     * @param value Value to be put in the node
     */
    CircularHeaderLinkedListNode(Item value) {
        this(value, null);
    }


    public CircularHeaderLinkedListNode getNext() {
        return next;
    }

    public void setNext(CircularHeaderLinkedListNode next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }
}