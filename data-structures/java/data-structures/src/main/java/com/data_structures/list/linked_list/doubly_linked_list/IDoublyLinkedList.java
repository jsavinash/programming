package com.data_structures.list.linked_list.doubly_linked_list;

interface IDoublyLinkedList<Item> {
    public void checkBounds(int position, int low, int high);

    public void insert(Item item);

    public void printItems();

    //Floyd’s Cycle Finding Algorithm (slow(+1) and fast(+2) pointer)
    public Item middle();

    public void createLoop();

    //Floyd’s Cycle Finding Algorithm (slow(+1) and fast(+2) pointer)
    public boolean detectLoopByFloydCycleFindingAlorithm();

    public boolean detectLoopByHash();

    //  public void swapNodes(int valueFirst, int valueSecond);

    //  public SinglyLinkedListNode<Item> reverse();
}