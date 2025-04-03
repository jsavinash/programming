from src.list.linked_list.skip_list.ISkip_List_Node import ISkipListNode


class SkipListNode(ISkipListNode):

    def __init__(self, value=None, max_level=0):
        self._value = value
        self._down = [None] * (max_level + 1)
        for x in range(max_level):
            new_node = SkipListNode()
            self._down[x] = new_node

    @property
    def value(self):
        return self._value

    @value.setter
    def value(self, val):
        self._value = val

    @value.deleter
    def value(self):
        del self._value

    @property
    def down(self):
        return self._down

    @down.setter
    def down(self, val):
        self._down = val

    @down.deleter
    def down(self):
        del self._down
