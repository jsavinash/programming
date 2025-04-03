package com.data_structures_2.array.skip_list;

public class SkipListNode<T> {
    T value;
    SkipListNode<T>[] forward;

    @SuppressWarnings("unchecked")
    public SkipListNode(T value, int level) {
        this.value = value;
        this.forward = new SkipListNode[level + 1];
    }
}
