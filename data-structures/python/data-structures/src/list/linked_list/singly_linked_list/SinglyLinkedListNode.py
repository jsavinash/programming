from src.list.linked_list.singly_linked_list.ISinglyLinkedListNode import ISinglyLinkedListNode


class SinglyLinkedListNode(ISinglyLinkedListNode):
    def __init__(self, data=None, next=None):
        self._data = data
        self._next = next

    @property
    def data(self):  # Overrides abstract getter
        return self._data

    @data.setter
    def data(self, val):  # Overrides abstract setter
        self._data = val

    @property
    def next(self):  # Overrides abstract getter
        return self._next

    @next.setter
    def next(self, val):  # Overrides abstract setter
        self._next = val
