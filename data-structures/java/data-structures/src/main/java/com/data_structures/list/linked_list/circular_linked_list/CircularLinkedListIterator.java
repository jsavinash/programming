package com.data_structures.list.linked_list.circular_linked_list;

import java.util.Iterator;
import java.util.NoSuchElementException;

class CircularLinkedListIterator<Item> implements Iterator<Item> {
    private CircularLinkedListNode<Item> currentNode;
    private int currentSize;


    CircularLinkedListIterator(CircularLinkedListNode<Item> head, int currentSize) {
        this.currentNode = (CircularLinkedListNode<Item>) head;
        this.currentSize = (int) currentSize;
    }

    public boolean hasNext() {
        if (currentSize == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final var data = currentNode.getData();
        currentNode = currentNode.getNext();
        currentSize--;
        return data;
    }

    public CircularLinkedListNode<Item> nextNode() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final CircularLinkedListNode<Item> node = currentNode;
        currentNode = currentNode.getNext();
        return node;
    }
}