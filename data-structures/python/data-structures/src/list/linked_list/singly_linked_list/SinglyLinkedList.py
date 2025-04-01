from src.list.linked_list.singly_linked_list.ISinglyLinkedList import ISinglyLinkedList
from src.list.linked_list.singly_linked_list.SinglyLinkedListNode import SinglyLinkedListNode


class SinglyLinkedList(ISinglyLinkedList):
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

    def addNode(self, data):
        newNode = SinglyLinkedListNode(data)
        if self.head == None:
            self.head = self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode

    def printNodes(self):
        tempHead = self.head;
        while tempHead != None:
            print(tempHead.data)
            tempHead = tempHead.next

    def __iter__(self):
        self.tempHead = self.head
        return self

    def __next__(self):
        currentValue = None
        if self.tempHead is not None:
            currentValue = self.tempHead.data
            self.tempHead = self.tempHead.next
        return currentValue


singlyLinkedList = SinglyLinkedList()
singlyLinkedList.addNode(1)
singlyLinkedList.addNode(2)
iterator = iter(singlyLinkedList)
print(next(iterator))
print(next(iterator))
