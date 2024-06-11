package com.data_structures.list.linked_list.xor_linked_list;

class XorLinkedListNode<Element> {
    Element data;
    int both;

    XorLinkedListNode(Element value) {
        data = value;
        both = 0;
    }
}