package com.data_structures.list.linked_list.header_linked_list.grounded_header_linked_list;


import java.util.Iterator;

class GroundedHeaderLinkedList<Item> implements Iterable<Item>, IGroundedHeaderLinkedList<Item> {
    private GroundedHeaderLinkedListNode<GlobalInformation> head;


    GroundedHeaderLinkedList() {
        GlobalInformation globalInformation = new GlobalInformation(0);
        GroundedHeaderLinkedListNode groundedHeaderLinkedListNode = new GroundedHeaderLinkedListNode<GlobalInformation>();
        groundedHeaderLinkedListNode.setData(globalInformation);
        this.head = groundedHeaderLinkedListNode;
    }

    public void insert(Item item) {
        insertNth(item, this.head.getData().getSize());
    }

    public void globalInformationSizeIncrement() {
        this.head.getData().setSize(this.head.getData().getSize() + 1);
    }

    public void insertNth(Item item, int position) {
        checkBounds(position, 0, this.head.getData().getSize());
        GroundedHeaderLinkedListNode<Item> newNode = new GroundedHeaderLinkedListNode<Item>(item);
        if (this.head.getNext() == null) {
            this.head.setNext(newNode);
            globalInformationSizeIncrement();
            return;
        }
        if (position == 0) {
            this.head.setNext(newNode);
            globalInformationSizeIncrement();
            return;
        }

        GroundedHeaderLinkedListNode<Item> tempNode = this.head.getNext();
        for (int i = 0; i < position - 1; ++i) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
        globalInformationSizeIncrement();
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void printGlobalInformation() {
        System.out.println("Size :- " + this.head.getData().getSize());
    }

    public void printItems() {
        Iterator<Item> iterator = iterator();
        while (iterator.hasNext()) {
            Item data = iterator.next();
            System.out.print(data + " => ");
        }
        System.out.println("NULL");
    }

    public GroundedHeaderLinkedListIterator<Item> iterator() {
        return new GroundedHeaderLinkedListIterator<Item>(this.head);
    }

    public static void main(String[] args) {
        GroundedHeaderLinkedList<String> groundedHeaderLinkedList = new GroundedHeaderLinkedList<String>();
        groundedHeaderLinkedList.insert("avinash");
        groundedHeaderLinkedList.insert("nishad");
        groundedHeaderLinkedList.insert("Demo");
        groundedHeaderLinkedList.printItems();
        groundedHeaderLinkedList.printGlobalInformation();
    }
}
