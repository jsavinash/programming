package com.data_structures.list.linked_list.header_linked_list.circular_header_linked_list;

import java.util.Iterator;

class CircularHeaderLinkedList<Item> implements Iterable<Item>, ICircularHeaderLinkedList<Item> {
    private CircularHeaderLinkedListNode<GlobalInformation> head;


    CircularHeaderLinkedList() {
        GlobalInformation globalInformation = new GlobalInformation(0);
        CircularHeaderLinkedListNode groundedHeaderLinkedListNode = new CircularHeaderLinkedListNode<GlobalInformation>();
        groundedHeaderLinkedListNode.setData(globalInformation);
        this.head = groundedHeaderLinkedListNode;
    }

    public void insert(Item item) {
        insertNth(item, this.globalInformationSize());
    }

    public void globalInformationSizeIncrement() {
        this.head.getData().setSize(this.head.getData().getSize() + 1);
    }

    public int globalInformationSize() {
        return this.head.getData().getSize();
    }

    public void insertNth(Item item, int position) {
        checkBounds(position, 0, this.head.getData().getSize());
        CircularHeaderLinkedListNode<Item> newNode = new CircularHeaderLinkedListNode<Item>(item);
        if (this.head.getNext() == null) {
            newNode.setNext(this.head.getNext());
            this.head.setNext(newNode);
            globalInformationSizeIncrement();
            return;
        }
        if (position == 0) {
            newNode.setNext(this.head.getNext());
            this.head.setNext(newNode);
            globalInformationSizeIncrement();
            return;
        }

        CircularHeaderLinkedListNode<Item> tempNode = this.head.getNext();
        for (int i = 0; i < position - 1; ++i) {
            tempNode = tempNode.getNext();
        }
        if (globalInformationSize() == position) {
            newNode.setNext(this.head);
            tempNode.setNext(newNode);
            globalInformationSizeIncrement();
        } else {
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
            globalInformationSizeIncrement();
        }
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void printGlobalInformation() {
        System.out.println("");
        System.out.println("Size :- " + this.head.getData().getSize());
    }

    public void printItems() {
        Iterator<Item> iterator = iterator();
        while (iterator.hasNext()) {
            Item data = iterator.next();
            System.out.print(data + " => ");
        }
        System.out.print("NULL");
    }

    public CircularHeaderLinkedListIterator<Item> iterator() {
        return new CircularHeaderLinkedListIterator<Item>(this.head, this.globalInformationSize());
    }

    public static void main(String[] args) {
        CircularHeaderLinkedList<String> groundedHeaderLinkedList = new CircularHeaderLinkedList<String>();
        groundedHeaderLinkedList.insert("avinash");
        groundedHeaderLinkedList.insert("nishad");
        groundedHeaderLinkedList.insert("Demo");
        groundedHeaderLinkedList.printItems();
        groundedHeaderLinkedList.printGlobalInformation();
    }
}
