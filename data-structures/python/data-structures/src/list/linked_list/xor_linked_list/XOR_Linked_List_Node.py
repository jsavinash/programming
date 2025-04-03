from src.list.linked_list.xor_linked_list.IXOR_Linked_List_Node import IXORLinkedListNode


class XORLinkedListNode(IXORLinkedListNode):

    def __init__(self, data=None, both= 0):
        self._data = data;
        self._both = both;

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
    def both(self):
        return self._both

    @both.setter
    def both(self, val):
        self._both = val

    @both.deleter
    def both(self):
        del self._both
