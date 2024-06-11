package com.data_structures.list.linked_list.header_linked_list.grounded_header_linked_list;


import java.util.Iterator;
import java.util.NoSuchElementException;

class GroundedHeaderLinkedListIterator<Item> implements Iterator<Item> {
    private GroundedHeaderLinkedListNode<GlobalInformation> head;
    private GroundedHeaderLinkedListNode<Item> currentNode;

    GroundedHeaderLinkedListIterator(GroundedHeaderLinkedListNode<GlobalInformation> head) {
        head = (GroundedHeaderLinkedListNode<GlobalInformation>) head;
        currentNode = head.getNext();
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final var data = currentNode.getData();
        currentNode = currentNode.getNext();
        return data;
    }

    public GroundedHeaderLinkedListNode<Item> nextNode() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final GroundedHeaderLinkedListNode<Item> node = currentNode;
        currentNode = currentNode.getNext();
        return node;
    }
}