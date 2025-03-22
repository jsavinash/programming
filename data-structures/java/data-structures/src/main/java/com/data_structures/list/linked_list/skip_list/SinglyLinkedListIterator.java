package com.data_structures.list.linked_list.skip_list;

import java.util.Iterator;
import java.util.NoSuchElementException;

class SinglyLinkedListIterator<Item> implements Iterator<Item> {
    private SkipListNode<Item> currentNode;

    SinglyLinkedListIterator(SkipListNode<Item> head) {
        currentNode = (SkipListNode<Item>) head;
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final var data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }

    public SkipListNode<Item> nextNode() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final SkipListNode<Item> node = currentNode;
        currentNode = currentNode.next;
        return node;
    }
}