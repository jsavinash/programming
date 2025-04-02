from abc import ABC, abstractmethod


class ICircularDoublyLinkedList(ABC):
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
    def add_data(self):
        pass

    @abstractmethod
    def remove_data(self, data):
        pass

    @abstractmethod
    def print_nodes(self):
        pass
