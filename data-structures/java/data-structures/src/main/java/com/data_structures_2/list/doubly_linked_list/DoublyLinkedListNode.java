package com.data_structures_2.list.doubly_linked_list;

public class DoublyLinkedListNode<T> implements IDoublyLinkedListNode<T> {
    private T data;
    private IDoublyLinkedListNode<T> next;
    private IDoublyLinkedListNode<T> prev;


    public DoublyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DoublyLinkedListNode(T data, IDoublyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public DoublyLinkedListNode(T data, IDoublyLinkedListNode<T> next, IDoublyLinkedListNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }


    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(IDoublyLinkedListNode<T> next) {
        this.next = next;
    }

    public IDoublyLinkedListNode<T> getNext() {
        return this.next;
    }

    public void setPrev(IDoublyLinkedListNode<T> prev) {
        this.prev = prev;
    }

    public IDoublyLinkedListNode<T> getPrev() {
        return this.prev;
    }
}
