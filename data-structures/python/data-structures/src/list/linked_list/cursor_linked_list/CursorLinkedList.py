from src.list.linked_list.cursor_linked_list.ICursorLinkedList import ICursorLinkedList
from src.list.linked_list.singly_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


class CursorLinkedList(ICursorLinkedList):

    def __init__(self, max_capacity=10):
        self._cursor = [None] * max_capacity
        self._current_idx = 0
        self.max_capacity = max_capacity

    @property
    def cursor(self):
        return self._cursor

    @cursor.setter
    def cursor(self, val):
        self._cursor = val

    @cursor.deleter
    def cursor(self):
        del self._cursor

    @property
    def current_idx(self):
        return self._current_idx

    @current_idx.setter
    def current_idx(self, val):
        self._current_idx = val

    @current_idx.deleter
    def current_idx(self):
        del self._current_idx

    def add_data(self, data):
        new_node = SinglyLinkedListNode(data)
        if self.max_capacity > self.current_idx:
            new_node.next = self.current_idx + 1
        else:
            new_node.next = 0
        self.cursor[self.current_idx] = new_node
        self.current_idx += 1

    def print_data(self):
        for (idx, item) in enumerate(self.cursor):
            if self.cursor[idx] is not None and self.cursor[idx].data:
                print(f"{self.cursor[idx].data} =>", end=" ")

    def __iter__(self):
        self._temp_current_index = 0
        return self

    def __next__(self):
        val = None
        if self.max_capacity > self._temp_current_index:
            if self.cursor[self._temp_current_index] is not None:
                val = self.cursor[self._temp_current_index].data
            self._temp_current_index += 1
        return val


cursorLinkedList = CursorLinkedList(5)
cursorLinkedList.add_data(1)
cursorLinkedList.add_data(2)
cursorLinkedList.add_data(3)
iterator = iter(cursorLinkedList)
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
