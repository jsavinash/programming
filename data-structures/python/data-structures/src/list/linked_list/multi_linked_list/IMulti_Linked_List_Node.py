from abc import ABC


class IMultiLinkedListNode(ABC):
    @property
    def data(self):
        return

    @data.setter
    def data(self, val):
        pass

    @data.deleter
    def data(self):
        pass

    @property
    def next(self):
        return

    @next.setter
    def next(self, val):
        pass

    @next.deleter
    def next(self):
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
