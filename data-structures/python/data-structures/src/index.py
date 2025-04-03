class Node:
    def __init__(self, value):
        self.value = value
        self.both = None


class XORLinkedList:
    def __init__(self):
        # Dummy node to simplify edge cases
        self.head = Node(None)
        self.tail = Node(None)
        self.head.both = self.tail.both = 0

    def add(self, element):
        new_node = Node(element)
        new_node.both = self.get_pointer(self.tail)

        # Update the current tail
        self.tail.both ^= self.get_pointer(new_node)

        # Update the tail reference
        self.tail = new_node


# Example Usage
xor_linked_list = XORLinkedList()
xor_linked_list.add(1)
xor_linked_list.add(2)
xor_linked_list.add(3)

result_node = xor_linked_list.get(1)
print(result_node.value)  # Output: 2
