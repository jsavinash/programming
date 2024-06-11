package com.data_structures.list.linked_list.cursor_linked_list;

import java.util.Iterator;

class CursorLinkedListIterator<Element> implements Iterator<Element> {
    private CursorLinkedListNode<Element>[] cursorSpace;
    int currentIndex = 0;


    CursorLinkedListIterator(CursorLinkedListNode<Element>[] cursorSpace) {
        this.cursorSpace = cursorSpace;
    }

    public boolean hasNext() {
        if (this.cursorSpace[currentIndex].next == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Element next() {
        Element data = this.cursorSpace[currentIndex].data;
        this.currentIndex--;
        return data;
    }
}