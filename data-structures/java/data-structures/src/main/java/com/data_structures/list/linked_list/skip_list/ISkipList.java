package com.data_structures.list.linked_list.skip_list;

interface ISkipList<Item> {
    public void checkBounds(int position, int low, int high);

    public void insert(Item item);
}