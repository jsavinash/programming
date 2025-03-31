from abc import ABC, abstractmethod


class ISinglyLinkedList(ABC):
    def __init__(self):
        self._head = None
        self._tail = None

    @property
    def head(self):
        return

    @head.setter
    def head(self, val):
        pass

    @property
    def tail(self):
        return

    @tail.setter
    def tail(self, val):
        pass

    @abstractmethod  # Decorator to define an abstract method
    def addNode(self, data):
        pass

    @abstractmethod  # Decorator to define an abstract method
    def printNodes(self):
        pass