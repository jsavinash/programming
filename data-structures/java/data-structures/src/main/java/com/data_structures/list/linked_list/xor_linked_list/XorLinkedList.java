package com.data_structures.list.linked_list.xor_linked_list;

import java.util.HashMap;

class XorLinkedList<Element> implements IXorLinkedList<Element> {
    private XorLinkedListNode<Element> head;
    private XorLinkedListNode<Element> tail;

    private HashMap<Integer, XorLinkedListNode<Element>> nodes;

    XorLinkedList() {
        head = null;
        tail = null;
        nodes = new HashMap<Integer, XorLinkedListNode<Element>>();
    }

    private int _xor(int a, int b) {
        // Helper function to get the XOR of two IDs
        return a ^ b;
    }

    public void insertAtHead(Element data) {
        XorLinkedListNode newNode = new XorLinkedListNode(data);
        int newId = System.identityHashCode(newNode);
        nodes.put(newId, newNode);
        if (head != null) {
            newNode.both = _xor(0, System.identityHashCode(head));
            head.both = _xor(System.identityHashCode(newNode), 0);
        } else {
            tail = newNode;
        }
        head = newNode;
    }

    public void insertAtTail(int data) {
        // Inserts a new node with the provided data at the tail of the list
        XorLinkedListNode newNode = new XorLinkedListNode(data);
        int newId = System.identityHashCode(newNode);
        nodes.put(newId, newNode);

        if (tail != null) {
            // Adjusting both values for the new node and existing tail
            newNode.both = _xor(System.identityHashCode(tail), 0);
            tail.both = _xor(newNode.both, System.identityHashCode(tail));
        } else {
            // If the list is empty, the new node becomes the head
            head = newNode;
        }
        tail = newNode;
    }

    public void print() {
        XorLinkedListNode<Element> current = this.head;
        int prev = 0;
        while (current != null) {
            System.out.print(current.data + " => ");
            int next = _xor(prev, current.both);
            prev = System.identityHashCode(current);
            current = nodes.getOrDefault(next, null);
        }
    }

    public static void main(String[] args) {
        XorLinkedList<Integer> list = new XorLinkedList<Integer>();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);

        list.print(); // Expected: 20 10 30 40
    }
}
