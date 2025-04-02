from abc import ABC, abstractmethod


class ICircularHeaderLinkedList(ABC):
    @property
    def header(self):
        return

    @header.setter
    def header(self, val):
        pass

    @header.deleter
    def header(self, val):
        pass

    @property
    def tail(self):
        return

    @tail.setter
    def tail(self, val):
        pass

    @tail.deleter
    def tail(self, val):
        pass

    @abstractmethod
    def add_data(self, data):
        pass
