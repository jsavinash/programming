package com.data_structures.list.linked_list.skip_list;


class SkipList<Element> implements ISkipList<Element> {
    private SkipListNode<Element> head;
    private SkipListNode<Element> tail;
    private SkipListNode<Element> expressLaneHead;
    private SkipListNode<Element> expressLaneTail;
    private int size;

    SkipList() {
        this.head = null;
        this.tail = null;
        this.expressLaneHead = null;
        this.expressLaneTail = null;
        this.size = 0;
    }

    public void insert(Element element) {
        insertNth(element, size);
    }

    public void insertNth(Element element, int position) {
        SkipListNode<Element> newNode = new SkipListNode<Element>(element);
        if (this.head == null) {
            this.expressLaneHead = newNode;
            this.expressLaneTail = newNode;
            this.head = newNode;
            this.tail = newNode;
            this.size++;
            return;
        }
        
        this.tail.next = newNode;
        this.tail = newNode;
        if ((this.size + 1) % 2 == 0) {
            this.expressLaneTail.next = newNode;
            this.expressLaneTail = newNode;
        }
        this.size++;
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void printElements() {
        SkipListNode<Element> tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " => ");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SkipList<String> singlyLinkedList = new SkipList<String>();
        singlyLinkedList.insert("avinash");
        singlyLinkedList.insert("nishad");
        singlyLinkedList.insert("Demo");
        singlyLinkedList.insert("Demo2");
        singlyLinkedList.insert("Demo3");
        singlyLinkedList.insert("Demo4");
        singlyLinkedList.insert("Demo5");
        singlyLinkedList.insert("Demo6");
        singlyLinkedList.insert("Demo7");
        singlyLinkedList.insert("Demo8");

        singlyLinkedList.printElements();
    }
}
