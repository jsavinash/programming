from src.list.linked_list.circular_linked_list.interface.ICircular_Singly_Linked_List import ICircularSinglyLinkedList
from src.list.linked_list.singly_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


class CircularSinglyLinkedList(ICircularSinglyLinkedList):
    def __init__(self):
        self._head = None
        self._tail = None

    @property
    def head(self):
        return self._head

    @head.setter
    def head(self, val):
        self._head = val

    @property
    def tail(self):
        return self._tail

    @tail.setter
    def tail(self, val):
        self._tail = val

    def add_data(self, data):
        new_node = SinglyLinkedListNode(data)
        if self.head is None:
            self.head = self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
            self.tail.next = self.head

    def remove_data(self, data):
        temp_head = self.head
        self.head = None
        self.tail = None
        while temp_head is not None:
            if temp_head.data != data:
                self.add_data(temp_head.data)
            temp_head = temp_head.next

    def print_nodes(self):
        temp_head = self.head;
        while temp_head is not None:
            print(temp_head.data)
            if temp_head.next == self.head:
                temp_head = None
            else:
                temp_head = temp_head.next

    def __iter__(self):
        self.temp_head = self.head
        return self

    def __next__(self):
        current_value = None
        if self.temp_head is not None:
            current_value = self.temp_head.data
            if self.temp_head.next == self.head:
                self.temp_head = None
            else:
                self.temp_head = self.temp_head.next
        return current_value


circularSinglyLinkedList = CircularSinglyLinkedList()
circularSinglyLinkedList.add_data(1)
circularSinglyLinkedList.add_data(2)
circularSinglyLinkedList.add_data(3)
# circularSinglyLinkedList.remove_data(2)
iterator = iter(circularSinglyLinkedList)
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
