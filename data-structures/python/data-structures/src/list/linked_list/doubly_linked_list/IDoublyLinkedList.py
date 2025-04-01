from abc import ABC, abstractmethod


class IDoublyLinkedList(ABC):
    @property
    def head(self):
        return

    @head.setter
    def head(self, val):
        pass

    @head.deleter
    def head(self):
        pass

    @property
    def tail(self):
        return

    @tail.setter
    def tail(self, val):
        pass

    @tail.deleter
    def tail(self):
        pass

    @abstractmethod
    def addNode(self):
        pass

    @abstractmethod
    def printNodes(self):
        pass
