package com.data_structures.list.linked_list.doubly_linked_list;

import java.util.Iterator;
import java.util.NoSuchElementException;

class DoublyLinkedListIterator<Item> implements Iterator<Item> {
    private DoublyLinkedListNode<Item> currentNode;

    DoublyLinkedListIterator(DoublyLinkedListNode<Item> head) {
        currentNode = (DoublyLinkedListNode<Item>) head;
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

    public DoublyLinkedListNode<Item> nextNode() {
        if (!hasNext()) {
            throw new NoSuchElementException("No item found");
        }
        final DoublyLinkedListNode<Item> node = currentNode;
        currentNode = currentNode.getNext();
        return node;
    }
}