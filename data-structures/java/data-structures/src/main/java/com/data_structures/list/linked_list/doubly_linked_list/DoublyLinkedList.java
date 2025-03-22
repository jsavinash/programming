package com.data_structures.list.linked_list.doubly_linked_list;


import java.util.HashSet;
import java.util.Iterator;

class DoublyLinkedList<Item> implements Iterable<Item>, IDoublyLinkedList<Item> {

    private DoublyLinkedListNode<Item> head;
    private int size;


    DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(Item item) {
        insertNth(item, size);
    }

    public void createLoop() {
        DoublyLinkedListNode<Item> currentNode = this.head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(this.head);
    }

    public void insertNth(Item item, int position) {
        checkBounds(position, 0, size);
        DoublyLinkedListNode<Item> newNode = new DoublyLinkedListNode<Item>(item);
        if (this.head == null) {
            this.head = newNode;
            this.size++;
            return;
        }
        if (position == 0) {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
            this.size++;
            return;
        }

        DoublyLinkedListNode<Item> tempNode = this.head;
        for (int i = 0; i < position - 1; ++i) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        newNode.setPrev(tempNode);
        tempNode.setNext(newNode);
        tempNode.getNext().setPrev(newNode);
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
        System.out.println("NULL");
    }

    public DoublyLinkedListIterator<Item> iterator() {
        return new DoublyLinkedListIterator<Item>(this.head);
    }

    //Floyd’s Cycle Finding Algorithm (slow(+1) and fast(+2) pointer)
    public Item middle() {
        DoublyLinkedListNode<Item> temp = this.head;
        DoublyLinkedListNode<Item> slowPtr = temp;
        DoublyLinkedListNode<Item> fastPtr = temp;
        while (slowPtr.getNext() != null && fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        return slowPtr.getData();
    }

    @Override
    public boolean detectLoopByFloydCycleFindingAlorithm() {
        DoublyLinkedListNode<Item> slowPtr = this.head;
        DoublyLinkedListNode<Item> fastPtr = this.head;
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
        HashSet<DoublyLinkedListNode<Item>> set = new HashSet<DoublyLinkedListNode<Item>>();
        boolean isLoopDetected = false;
        DoublyLinkedListIterator iterator = iterator();

        while (iterator.hasNext()) {
            DoublyLinkedListNode<Item> currentNode = iterator.nextNode();
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
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
        doublyLinkedList.insert("avinash");
        doublyLinkedList.insert("nishad");
        doublyLinkedList.insert("Demo");
        doublyLinkedList.printItems();
        System.out.println(doublyLinkedList.middle());
        // singlyLinkedList.createLoop();
        System.out.println(doublyLinkedList.detectLoopByFloydCycleFindingAlorithm());
        System.out.println(doublyLinkedList.detectLoopByHash());
    }
}
