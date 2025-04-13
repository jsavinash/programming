from src.list.linked_list.singly_linked_list.interface.ISingly_Linked_List import ISinglyLinkedList
from src.list.linked_list.singly_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


class SinglyLinkedList(ISinglyLinkedList):
    def __init__(self):
        self._head = None
        self._tail = None

    @property
    def head(self):
        return self._head

    @head.setter
    def head(self, val):
        self._head = val

    @property
    def tail(self):
        return self._tail

    @tail.setter
    def tail(self, val):
        self._tail = val

    def add_data(self, data):
        new_node = SinglyLinkedListNode(data)
        if self.head is None:
            self.head = self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node

    def remove_data(self, data):
        temp_head = self.head
        self.head = None
        self.tail = None
        while temp_head is not None:
            if temp_head.data != data:
                self.add_data(temp_head.data)
            temp_head = temp_head.next

    def print_nodes(self):
        temp_head = self.head;
        while temp_head is not None:
            print(f"{temp_head.data} => ", end="")
            temp_head = temp_head.next
        print("")

    def __iter__(self):
        self.tempHead = self.head
        return self

    def __next__(self):
        current_value = None
        if self.tempHead is not None:
            current_value = self.tempHead.data
            self.tempHead = self.tempHead.next
        return current_value


singlyLinkedList = SinglyLinkedList()
singlyLinkedList.add_data(1)
singlyLinkedList.add_data(2)
singlyLinkedList.remove_data(2)
iterator = iter(singlyLinkedList)
print(next(iterator))
print(next(iterator))
