package com.data_structures.list.linked_list.header_linked_list.circular_header_linked_list;


import java.util.Iterator;
import java.util.NoSuchElementException;

class CircularHeaderLinkedListIterator<Item> implements Iterator<Item> {
    private CircularHeaderLinkedListNode<GlobalInformation> head;
    private CircularHeaderLinkedListNode<Item> currentNode;
    private int currentSize;

    CircularHeaderLinkedListIterator(CircularHeaderLinkedListNode<GlobalInformation> head, int currentSize) {
        this.head = (CircularHeaderLinkedListNode<GlobalInformation>) head;
        this.currentSize = (int) currentSize;
        this.currentNode = head.getNext();
    }

    public boolean hasNext() {
        return this.currentSize != 0;
    }

    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        Item data = this.currentNode.getData();
        this.currentNode = currentNode.getNext();
        this.currentSize--;
        return data;
    }

    public CircularHeaderLinkedListNode<Item> nextNode() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final CircularHeaderLinkedListNode<Item> node = this.currentNode;
        this.currentNode = currentNode.getNext();
        this.currentSize--;
        return node;
    }
}