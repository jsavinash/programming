from src.list.linked_list.doubly_linked_list.IDoublyLinkedList import IDoublyLinkedList
from src.list.linked_list.doubly_linked_list.DoublyLinkedListNode import DoublyLinkedListNode


class DoublyLinkedList(IDoublyLinkedList):
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

    def remove_data(self, data):
        tempHead = self.head
        self.head = None
        self.tail = None
        while tempHead is not None:
            if tempHead.data != data:
                self.add_data(tempHead.data)
            tempHead = tempHead.next

    def print_nodes(self):
        tempRef = self.head
        while tempRef is not None:
            print(tempRef.data)
            tempRef = tempRef.next

    def __iter__(self):
        self.tempNode = self.head
        return self

    def __next__(self):
        currentValue = None
        if self.tempNode and self.tempNode.data:
            currentValue = self.tempNode.data
            self.tempNode = self.tempNode.next
        return currentValue


doublyLinkedList = DoublyLinkedList()
doublyLinkedList.add_data(1)
doublyLinkedList.add_data(2)
doublyLinkedList.add_data(1)
iterator = iter(doublyLinkedList)
print(next(iterator))
print(next(iterator))
print(next(iterator))
