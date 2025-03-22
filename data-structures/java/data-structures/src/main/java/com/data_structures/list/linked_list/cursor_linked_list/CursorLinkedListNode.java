package com.data_structures.list.linked_list.cursor_linked_list;

class CursorLinkedListNode<Element> {
    Element data;
    int next;

    CursorLinkedListNode(Element data, int next) {
        this.data = data;
        this.next = next;
    }
}