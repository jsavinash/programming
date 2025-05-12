package com.data_structures_2.list.singly_linked_list;

public interface ISinglyLinkedListNode<T> {

    T getData();

    void setData(T data);

    ISinglyLinkedListNode<T> getNext();

    void setNext(ISinglyLinkedListNode<T> next);
}
