from src.list.linked_list.circular_linked_list.interface.IDoublyLinkedListNode import IDoublyLinkedListNode


class DoublyLinkedListNode(IDoublyLinkedListNode):
    def __init__(self, data=None, prev=None, next=None):
        self._data = data
        self.prev = prev
        self._next = next

    @property
    def data(self):
        return self._data

    @data.setter
    def data(self, val):
        self._data = val

    @data.deleter
    def data(self):
        del self._data

    @property
    def prev(self):
        return self._prev

    @prev.setter
    def prev(self, val):
        self._prev = val

    @prev.deleter
    def prev(self):
        del self._prev

    @property
    def next(self):
        return self._next

    @next.setter
    def next(self, val):
        self._next = val

    @next.deleter
    def next(self):
        del self._next
