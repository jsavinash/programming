package com.data_structures.bag;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Bag<Item> implements Iterable<Item> {
    public int size;
    public Node<Item> firstItem;

    private static final class Node<Item> {
        Item item;
        Node<Item> next;
    }

    public Bag() {
        firstItem = null;
        size = 0;
    }

    boolean isEmpty() {
        return this.firstItem == null;
    }

    int size() {
        return size;
    }


    public void addItem(Item item) {
        Node<Item> oldItems = this.firstItem;
        Node<Item> newItem = new Node<Item>();
        newItem.item = item;
        newItem.next = oldItems;
        this.firstItem = newItem;
        size++;
    }

    public void displayItems() {
        Iterator<Item> iterator = this.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(this.firstItem);
    }

    public boolean contains(Item item) {
        System.out.println("this : " + this);
        for (Item value : this) {
            if (value.equals(item)) {
                return true;
            }
        }
        return false;
    }

    class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> currentItem;

        ListIterator(Node<Item> firstItem) {
            this.currentItem = firstItem;
        }

        public boolean hasNext() {
            return currentItem != null;
        }

        public Item next() throws NoSuchElementException {
            Node<Item> current = currentItem;
            if (current != null) {
                currentItem = currentItem.next;
            } else {
                throw new NoSuchElementException("No item found");
            }
            return current.item;
        }
    }

    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        bag.addItem("milk");
        bag.addItem("bread");
        bag.addItem("milk");
        System.out.println(bag.contains("bread"));
        System.out.println("isEmpty :- " + bag.isEmpty());
        System.out.println("size :- " + bag.size());
        bag.displayItems();
    }
}
