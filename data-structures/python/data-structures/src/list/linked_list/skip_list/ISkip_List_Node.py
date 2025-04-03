from abc import ABC


class ISkipListNode(ABC):

    @property
    def value(self):
        return

    @value.setter
    def value(self, val):
        pass

    @value.deleter
    def value(self):
        pass

    @property
    def down(self):
        return

    @down.setter
    def down(self, val):
        pass

    @down.deleter
    def down(self):
        pass
