from abc import ABC


class IDoublyLinkedListNode(ABC):
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
    def prev(self):
        return

    @prev.setter
    def prev(self, val):
        pass

    @prev.deleter
    def prev(self):
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
