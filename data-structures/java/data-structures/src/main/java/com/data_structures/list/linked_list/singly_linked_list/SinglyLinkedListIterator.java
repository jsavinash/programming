package com.data_structures.list.linked_list.singly_linked_list;

import java.util.Iterator;
import java.util.NoSuchElementException;

class SinglyLinkedListIterator<Item> implements Iterator<Item> {
    private SinglyLinkedListNode<Item> currentNode;

    SinglyLinkedListIterator(SinglyLinkedListNode<Item> head) {
        currentNode = (SinglyLinkedListNode<Item>) head;
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

    public SinglyLinkedListNode<Item> nextNode() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final SinglyLinkedListNode<Item> node = currentNode;
        currentNode = currentNode.getNext();
        return node;
    }
}