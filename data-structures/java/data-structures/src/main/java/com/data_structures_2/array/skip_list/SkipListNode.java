package com.data_structures_2.array.skip_list;

public class ISkipListNode<ValueT, NodeT> {
    ValueT value;
    NodeT<ValueT>[] forward;
}
