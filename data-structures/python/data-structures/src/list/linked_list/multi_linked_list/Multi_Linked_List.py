from src.list.linked_list.multi_linked_list.Multi_Linked_List_Node import MultiLinkedListNode
from src.list.linked_list.multi_linked_list.IMulti_Linked_List import IMultiLinkedList


class MultiLinkedList(IMultiLinkedList):

    def __init__(self, head=None, tail=None):
        self._head = head
        self._tail = tail

    @property
    def head(self):
        return self._head

    @head.setter
    def head(self, val):
        self._head = val

    @head.deleter
    def head(self):
        del self._head

    @property
    def tail(self):
        return self._tail

    @tail.setter
    def tail(self, val):
        self._tail = val

    @tail.deleter
    def tail(self):
        del self._tail

    def add_data(self, data, down):
        new_node = MultiLinkedListNode(data)
        downNodeTail = None
        downNodeHead = None
        for x in down:
            x_new_node = MultiLinkedListNode(x)
            if downNodeTail is None:
                downNodeHead = downNodeTail = x_new_node
            else:
                downNodeTail.next = x_new_node
                downNodeTail = x_new_node

        new_node.down = downNodeHead

        if self.head is None:
            self.tail = self.head = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node

    def traverse(self, node):
        if node is not None:
            print(node.data)
            self.traverse(node.down)
            self.traverse(node.next)

    def display_list(self, node):
        while node is not None:
            print(node.data, end=" ")
            if node.down is not None:
                self.display_list(node.down)
            node = node.next


multiLinkedList = MultiLinkedList()
multiLinkedList.add_data(1, [4, 5, 6, 7])
multiLinkedList.add_data(2, [])
multiLinkedList.add_data(3, [])
multiLinkedList.traverse(multiLinkedList.head)
multiLinkedList.display_list(multiLinkedList.head)
