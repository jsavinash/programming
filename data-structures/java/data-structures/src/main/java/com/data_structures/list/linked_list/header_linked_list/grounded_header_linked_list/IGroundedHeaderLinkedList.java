package com.data_structures.list.linked_list.header_linked_list.grounded_header_linked_list;

interface IGroundedHeaderLinkedList<Item> {
    public void checkBounds(int position, int low, int high);

    public void insert(Item item);

    public void printItems();
}