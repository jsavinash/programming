from src.list.linked_list.xor_linked_list.XOR_Linked_List_Node import XORLinkedListNode
from src.list.linked_list.xor_linked_list.IXOR_Linked_List import IXORLinkedList


class XORLinkedList(IXORLinkedList):

    def __init__(self):
        self._head = None
        self._tail = None
        self.id_to_node = {}

    @property
    def head(self):
        return self._head

    @head.setter
    def head(self, val):
        self._head = val

    @head.deleter
    def head(self):
        del self._head

    @property
    def tail(self):
        return self._tail

    @tail.setter
    def tail(self, val):
        self._tail = val

    @tail.deleter
    def tail(self):
        del self._tail

    def XOR(self, a, b):
        return a ^ b

    def add_data(self, data):
        new_node = XORLinkedListNode(data)
        if self.head is None:
            self.head = self.tail = new_node
        else:
            new_node.both = id(self.tail)
            self.tail.both ^= id(new_node)
            self.tail = new_node

    def traverse(self):
        current = self.head
        previous_address = 0

        while current:
            print(current.data, end=" ")
            next_address = self.XOR(previous_address, current.npx)
            previous_address = id(current)
            current = self.get_node_from_address(next_address)

    def get_node_from_address(self, address):
        return None if address == 0 else self.id_to_node.get(address)


xor_linked_list = XORLinkedList()
xor_linked_list.add_data(1)
xor_linked_list.add_data(2)
xor_linked_list.add_data(3)
xor_linked_list.traverse()
