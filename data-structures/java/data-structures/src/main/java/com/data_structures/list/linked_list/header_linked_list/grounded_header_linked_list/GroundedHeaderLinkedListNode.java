package com.data_structures.list.linked_list.header_linked_list.grounded_header_linked_list;

class GroundedHeaderLinkedListNode<Item> {
    private Item data;
    private GroundedHeaderLinkedListNode next;

    GroundedHeaderLinkedListNode() {
    }

    GroundedHeaderLinkedListNode(Item value, GroundedHeaderLinkedListNode next) {
        data = value;
        next = next;
    }

    /**
     * Constructor
     *
     * @param value Value to be put in the node
     */
    GroundedHeaderLinkedListNode(Item value) {
        this(value, null);
    }


    public GroundedHeaderLinkedListNode getNext() {
        return next;
    }

    public void setNext(GroundedHeaderLinkedListNode next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }
}