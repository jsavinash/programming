package com.data_structures.list.linked_list.skip_list;

class SkipListNode<Item> {
    public Item data;
    public SkipListNode next;

    SkipListNode() {
    }

    SkipListNode(Item value, SkipListNode next) {
        data = value;
        next = next;
    }

    /**
     * Constructor
     *
     * @param value Value to be put in the node
     */
    SkipListNode(Item value) {
        this(value, null);
    }
}