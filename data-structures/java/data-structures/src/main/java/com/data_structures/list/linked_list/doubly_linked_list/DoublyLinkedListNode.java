package com.data_structures.list.linked_list.doubly_linked_list;

class DoublyLinkedListNode<Item> {
    private Item data;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;


    DoublyLinkedListNode(Item data, DoublyLinkedListNode prev, DoublyLinkedListNode next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Constructor
     *
     * @param value Value to be put in the node
     */
    DoublyLinkedListNode(Item value) {
        this(value, null, null);
    }

    public DoublyLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode prev) {
        this.prev = prev;
    }


    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }
}