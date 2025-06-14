from abc import ABC


class IGeneralTreeNode(ABC):
    @property
    def length(self):
        return

    @length.setter
    def length(self, val):
        pass

    @length.deleter
    def length(self):
        pass

    @property
    def level(self):
        return

    @level.setter
    def level(self, val):
        pass

    @level.deleter
    def level(self):
        pass

    @property
    def parent(self):
        return

    @parent.setter
    def parent(self, val):
        pass

    @parent.deleter
    def parent(self):
        pass

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
    def children(self):
        return

    @children.deleter
    def children(self):
        pass

    def addChild(self, child):
        return

    def popChild(self):
        pass
