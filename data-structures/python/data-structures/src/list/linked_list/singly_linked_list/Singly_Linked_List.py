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
        newNode = SinglyLinkedListNode(data)
        if self.head == None:
            self.head = self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode

    def remove_data(self, data):
        tempHead = self.head
        self.head = None
        self.tail = None
        while tempHead is not None:
            if tempHead.data != data:
                self.add_data(tempHead.data)
            tempHead = tempHead.next

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
        currentValue = None
        if self.tempHead is not None:
            currentValue = self.tempHead.data
            self.tempHead = self.tempHead.next
        return currentValue


singlyLinkedList = SinglyLinkedList()
singlyLinkedList.add_data(1)
singlyLinkedList.add_data(2)
singlyLinkedList.remove_data(2)
iterator = iter(singlyLinkedList)
print(next(iterator))
print(next(iterator))
