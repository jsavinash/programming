package com.data_structures_2.list.doubly_linked_list;

public interface IDoublyLinkedListNode<T> {

    T getData();

    void setData(T data);

    IDoublyLinkedListNode<T> getNext();

    void setNext(IDoublyLinkedListNode<T> next);

    IDoublyLinkedListNode<T> getPrev();

    void setPrev(IDoublyLinkedListNode<T> prev);
}
