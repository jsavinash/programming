from src.list.linked_list.circular_linked_list.interface.ICircular_Singly_Linked_List import ICircularSinglyLinkedList
from src.list.linked_list.circular_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


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
        newNode = SinglyLinkedListNode(data)
        if self.head == None:
            self.head = self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.tail.next = self.head

    def remove_data(self, data):
        tempHead = self.head
        self.head = None
        self.tail = None
        while tempHead is not None:
            if tempHead.data != data:
                self.add_data(tempHead.data)
            tempHead = tempHead.next

    def print_nodes(self):
        tempHead = self.head;
        while tempHead is not None:
            print(tempHead.data)
            if tempHead.next == self.head:
                tempHead = None
            else:
                tempHead = tempHead.next

    def __iter__(self):
        self.tempHead = self.head
        return self

    def __next__(self):
        currentValue = None
        if self.tempHead is not None:
            currentValue = self.tempHead.data
            if self.tempHead.next == self.head:
                self.tempHead = None
            else:
                self.tempHead = self.tempHead.next
        return currentValue


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
