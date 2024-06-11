package com.data_structures.list.linked_list.singly_linked_list;


import java.util.HashSet;
import java.util.Iterator;

class SinglyLinkedList<Item> implements Iterable<Item>, ISinglyLinkedList<Item> {
    private SinglyLinkedListNode<Item> head;
    private int size;


    SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(Item item) {
        insertNth(item, size);
    }

    public void createLoop() {
        SinglyLinkedListNode<Item> currentNode = this.head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(this.head);
    }

    public void insertNth(Item item, int position) {
        checkBounds(position, 0, size);
        SinglyLinkedListNode<Item> newNode = new SinglyLinkedListNode<Item>(item);
        if (this.head == null) {
            this.head = newNode;
            this.size++;
            return;
        }
        if (position == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
            this.size++;
            return;
        }

        SinglyLinkedListNode<Item> tempNode = this.head;
        for (int i = 0; i < position - 1; ++i) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
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

    public SinglyLinkedListIterator<Item> iterator() {
        return new SinglyLinkedListIterator<Item>(this.head);
    }

    //Floyd’s Cycle Finding Algorithm (slow(+1) and fast(+2) pointer)
    public Item middle() {
        SinglyLinkedListNode<Item> temp = this.head;
        SinglyLinkedListNode<Item> slowPtr = temp;
        SinglyLinkedListNode<Item> fastPtr = temp;
        while (slowPtr.getNext() != null && fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        return slowPtr.getData();
    }

    @Override
    public boolean detectLoopByFloydCycleFindingAlorithm() {
        SinglyLinkedListNode<Item> slowPtr = this.head;
        SinglyLinkedListNode<Item> fastPtr = this.head;
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
        HashSet<SinglyLinkedListNode<Item>> set = new HashSet<SinglyLinkedListNode<Item>>();
        boolean isLoopDetected = false;
        SinglyLinkedListIterator iterator = iterator();

        while (iterator.hasNext()) {
            SinglyLinkedListNode<Item> currentNode = iterator.nextNode();
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
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
        singlyLinkedList.insert("avinash");
        singlyLinkedList.insert("nishad");
        singlyLinkedList.insert("Demo");
        singlyLinkedList.printItems();
        System.out.println(singlyLinkedList.middle());
        // singlyLinkedList.createLoop();
        System.out.println(singlyLinkedList.detectLoopByFloydCycleFindingAlorithm());
        System.out.println(singlyLinkedList.detectLoopByHash());
    }
}
