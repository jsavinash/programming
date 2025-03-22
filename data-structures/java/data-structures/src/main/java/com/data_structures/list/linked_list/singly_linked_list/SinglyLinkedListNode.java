package com.data_structures.list.linked_list.singly_linked_list;

class SinglyLinkedListNode<Item> {
    private Item data;
    private SinglyLinkedListNode next;

    SinglyLinkedListNode() {
    }

    SinglyLinkedListNode(Item value, SinglyLinkedListNode next) {
        data = value;
        next = next;
    }

    /**
     * Constructor
     *
     * @param value Value to be put in the node
     */
    SinglyLinkedListNode(Item value) {
        this(value, null);
    }


    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }
}