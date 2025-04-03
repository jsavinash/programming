from src.list.linked_list.multi_linked_list.IMulti_Linked_List_Node import IMultiLinkedListNode


class MultiLinkedListNode(IMultiLinkedListNode):

    def __init__(self, data=None, next=None, down=None):
        self._data = data
        self._next = next
        self._down = down

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
    def next(self):
        return self._next

    @next.setter
    def next(self, val):
        self._next = val

    @next.deleter
    def next(self):
        del self._next

    @property
    def down(self):
        return self._down

    @down.setter
    def down(self, val):
        self._down = val

    @down.deleter
    def down(self):
        del self._down
