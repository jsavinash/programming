package com.data_structures.list.linked_list.circular_linked_list;


import java.util.HashSet;
import java.util.Iterator;

class CircularLinkedList<Item> implements Iterable<Item>, ICircularLinkedList<Item> {

    private CircularLinkedListNode<Item> head;
    private CircularLinkedListNode<Item> tail;
    private int size;


    CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(Item item) {
        insertNth(item, size);
    }

    public void createLoop() {
        CircularLinkedListNode<Item> currentNode = this.head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(this.head);
    }

    public void insertNth(Item item, int position) {
        checkBounds(position, 0, size);
        CircularLinkedListNode<Item> newNode = new CircularLinkedListNode<Item>(item);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
            return;
        }
        if (position == 0) {
            newNode.setNext(this.head);
            newNode.setPrev(this.tail);
            this.head.setPrev(newNode);
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.size++;
            return;
        }

        if (position == size) {
            newNode.setNext(this.head);
            newNode.setPrev(this.tail);
            this.head.setPrev(newNode);
            this.tail.setNext(newNode);
            this.tail = newNode;
        } else {
            CircularLinkedListNode<Item> tempNode = this.head;
            for (int i = 0; i < position - 1; ++i) {
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            newNode.setPrev(tempNode);
            tempNode.setNext(newNode);
            tempNode.getNext().setPrev(newNode);
        }

        this.size++;
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void printItems() {
        Iterator<Item> iterator = iterator();
        while (iterator.hasNext()) {
            Item data = iterator.next();
            System.out.print(data + " => ");
        }
        System.out.println("Loop");
    }

    public CircularLinkedListIterator<Item> iterator() {
        return new CircularLinkedListIterator<Item>(this.head, this.size);
    }

    //Floyd’s Cycle Finding Algorithm (slow(+1) and fast(+2) pointer)
    public Item middle() {
        CircularLinkedListNode<Item> temp = this.head;
        CircularLinkedListNode<Item> slowPtr = temp;
        CircularLinkedListNode<Item> fastPtr = temp;
        while (slowPtr.getNext() != null && fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        return slowPtr.getData();
    }

    @Override
    public boolean detectLoopByFloydCycleFindingAlorithm() {
        CircularLinkedListNode<Item> slowPtr = this.head;
        CircularLinkedListNode<Item> fastPtr = this.head;
        boolean isLoopDetected = false;
        while (slowPtr.getNext() != null && fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if (slowPtr == fastPtr) {
                isLoopDetected = true;
                break;
            }
        }
        return isLoopDetected;
    }

    @Override
    public boolean detectLoopByHash() {
        HashSet<CircularLinkedListNode<Item>> set = new HashSet<CircularLinkedListNode<Item>>();
        boolean isLoopDetected = false;
        CircularLinkedListIterator iterator = iterator();

        while (iterator.hasNext()) {
            CircularLinkedListNode<Item> currentNode = iterator.nextNode();
            if (set.contains(currentNode)) {
                isLoopDetected = true;
                break;
            } else {
                set.add(currentNode);
            }
        }
        return isLoopDetected;
    }

    public static void main(String[] args) {
        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<String>();
        circularLinkedList.insert("One");
        circularLinkedList.insert("Two");
        circularLinkedList.insert("Three");
        System.out.println(circularLinkedList);

        circularLinkedList.printItems();
        //   System.out.println(circularLinkedList.middle());
        // singlyLinkedList.createLoop();
        //   System.out.println(circularLinkedList.detectLoopByFloydCycleFindingAlorithm());
        //   System.out.println(circularLinkedList.detectLoopByHash());
    }
}
