package com.data_structures_2.list.singly_linked_list;

public class SinglyLinkedListNode<T> implements ISinglyLinkedListNode<T> {
    private T data;
    private ISinglyLinkedListNode<T> next;


    public SinglyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }

    public SinglyLinkedListNode(T data, ISinglyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(ISinglyLinkedListNode<T> next) {
        this.next = next;
    }

    public ISinglyLinkedListNode<T> getNext() {
        return this.next;
    }
}
