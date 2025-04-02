from src.list.linked_list.header_linked_list.circular_header_linked_list.ICircular_Header_Linked_List import \
    ICircularHeaderLinkedList
from src.list.linked_list.singly_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


class CircularHeaderLinkedList(ICircularHeaderLinkedList):

    def __init__(self):
        self._header = SinglyLinkedListNode()
        self._tail = None

    @property
    def header(self):
        return self._header

    @header.setter
    def header(self, val):
        self._header = val

    @header.deleter
    def header(self, val):
        del self._header

    @property
    def tail(self):
        return self._tail

    @tail.setter
    def tail(self, val):
        self._tail = val

    @tail.deleter
    def tail(self, val):
        del self._tail

    def add_data(self, data):
        new_node = SinglyLinkedListNode(data)
        new_node.next = self.header
        if self.header.next is None:
            self.tail = self.header.next = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node

    def remove_data(self, data):
        temp_head = self.header.next
        self.header.next = None
        while temp_head is not None:
            if temp_head.data != data:
                self.add_data(temp_head.next)
            temp_head = temp_head.next

    def __iter__(self):
        self._iterator_head = self.header.next
        return self

    def __next__(self):
        value = None
        if self._iterator_head is not None:
            if self._iterator_head.data is not None:
                value = self._iterator_head.data
            if self._iterator_head.next == self._iterator_head:
                self._iterator_head = None
            else:
                self._iterator_head = self._iterator_head.next
        return value


circularHeaderLinkedList = CircularHeaderLinkedList()
circularHeaderLinkedList.add_data(1)
circularHeaderLinkedList.add_data(2)
circularHeaderLinkedList.add_data(3)
iterator = iter(circularHeaderLinkedList)
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
