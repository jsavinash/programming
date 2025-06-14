from src.tree.general_tree.interface.IGeneralTreeNode import IGeneralTreeNode


class GeneralTreeNode(IGeneralTreeNode):
    def __init__(self, data=None, parent=None, length=None, level=None):
        self._data = data
        self._parent = parent
        self._length = length
        self._level = level
        self._children = []

    @property
    def data(self):
        return self._data

    @data.setter
    def data(self, val):
        self._data = val

    @property
    def parent(self):
        return self._parent

    @parent.setter
    def parent(self, val):
        self._parent = val

    @property
    def length(self):
        return self._length

    @length.setter
    def length(self, val):
        self._length = val

    @property
    def level(self):
        return self._level

    @level.setter
    def level(self, val):
        self._level = val

    @property
    def children(self):
        return self._children

    def addChild(self, child):
        self._children.append(child)

    def popChild(self):
        self._children.pop()
