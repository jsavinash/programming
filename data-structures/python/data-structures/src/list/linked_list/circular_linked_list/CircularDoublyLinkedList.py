from src.list.linked_list.circular_linked_list.interface.ICircularDoublyLinkedList import ICircularDoublyLinkedList
from src.list.linked_list.circular_linked_list.implementation.DoublyLinkedListNode import DoublyLinkedListNode


class CircularDoublyLinkedList(ICircularDoublyLinkedList):
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
        pass

    @property
    def tail(self):
        return self._tail

    @tail.setter
    def tail(self, val):
        self._tail = val

    @tail.deleter
    def tail(self):
        del self._tail

    def add_data(self, data):
        newNode = DoublyLinkedListNode(data, None, None)
        if self.head is None:
            self.head = self.tail = newNode
        else:
            tempNode = self.tail
            self.tail.next = newNode
            newNode.prev = tempNode
            self.tail = newNode
        self.tail.next = self.head
        self.head.prev = self.tail

    def remove_data(self, data):
        tempHead = self.head
        headNodeRef = self.head
        self.head = None
        self.tail = None
        while tempHead is not None:
            if tempHead.data != data:
                self.add_data(tempHead.data)
            if tempHead.next == headNodeRef:
                tempHead = None
            else:
                tempHead = tempHead.next

    def print_nodes(self):
        tempRef = self.head
        while tempRef is not None:
            print(tempRef.data)
            tempRef = tempRef.next
            if tempRef.next == self.head:
                tempRef = None
            else:
                tempRef = tempRef.next

    def __iter__(self):
        self.tempNode = self.head
        return self

    def __next__(self):
        currentValue = None
        if self.tempNode and self.tempNode.data:
            currentValue = self.tempNode.data
            if self.tempNode.next == self.head:
                self.tempNode = None
            else:
                self.tempNode = self.tempNode.next
        return currentValue


circularDoublyLinkedList = CircularDoublyLinkedList()
circularDoublyLinkedList.add_data(1)
circularDoublyLinkedList.add_data(2)
circularDoublyLinkedList.add_data(3)
circularDoublyLinkedList.remove_data(1)
iterator = iter(circularDoublyLinkedList)
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
