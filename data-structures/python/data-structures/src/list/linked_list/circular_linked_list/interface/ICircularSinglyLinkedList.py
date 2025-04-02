from abc import ABC, abstractmethod


class ICircularSinglyLinkedList(ABC):
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
    def add_data(self, data):
        pass

    @abstractmethod  # Decorator to define an abstract method
    def remove_data(self, data):
        pass

    @abstractmethod  # Decorator to define an abstract method
    def print_nodes(self):
        pass
