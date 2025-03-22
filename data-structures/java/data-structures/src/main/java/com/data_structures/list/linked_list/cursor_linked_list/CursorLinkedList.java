package com.data_structures.list.linked_list.cursor_linked_list;

class CursorLinkedList<Element> implements Iterable<Element>, ICursorLinkedList<Element> {
    private final int os;
    private int head;
    private int currentIndex;
    private final CursorLinkedListNode<Element>[] cursorSpace;
    private int count;
    private static final int CURSOR_SPACE_SIZE = 100;

    {
        // init at loading time
        cursorSpace = new CursorLinkedListNode[CURSOR_SPACE_SIZE];
        for (int i = 0; i < CURSOR_SPACE_SIZE; i++) {
            cursorSpace[i] = new CursorLinkedListNode<>(null, i + 1);
        }
        cursorSpace[CURSOR_SPACE_SIZE - 1].next = 0;
    }

    public CursorLinkedList() {
        os = 0;
        count = 0;
        head = -1;
        currentIndex = 0;
    }

    public CursorLinkedListIterator<Element> iterator() {
        return new CursorLinkedListIterator<Element>(this.cursorSpace);
    }

    public void insert(Element element) {
        if (this.currentIndex <= CURSOR_SPACE_SIZE - 1) {
            cursorSpace[this.currentIndex].data = element;
            if (this.currentIndex == CURSOR_SPACE_SIZE - 1) {
                cursorSpace[this.currentIndex].next = 0;
            } else {
                cursorSpace[this.currentIndex].next = this.currentIndex + 1;
                this.currentIndex++;
            }
        }
    }

    public void print() {
        int start = 0;
        while (start <= CURSOR_SPACE_SIZE - 1 && cursorSpace[start].data != null) {
            System.out.print(cursorSpace[start].data + " => ");
            start = cursorSpace[start].next;
        }
    }

    public static void main(String[] args) {
        CursorLinkedList<String> cursorLinkedList = new CursorLinkedList<String>();
        cursorLinkedList.insert("avinash");
        cursorLinkedList.insert("nishad");
        cursorLinkedList.insert("demo");
        cursorLinkedList.print();
    }
}