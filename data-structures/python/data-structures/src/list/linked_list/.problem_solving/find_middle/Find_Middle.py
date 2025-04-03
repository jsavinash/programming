from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class MiddleNode(SinglyLinkedList):
    def middle_node(self):
        slow_pointer = self.head
        fast_pointer = self.head
        while (slow_pointer is not None
               and slow_pointer.next is not None
               and fast_pointer is not None
               and fast_pointer.next is not None
               and fast_pointer.next.next is not None):
            slow_pointer = slow_pointer.next
            fast_pointer = fast_pointer.next.next
        return slow_pointer.data


middleNode = MiddleNode()
print("Middle Node")
middleNode.add_data(1)
middleNode.add_data(2)
middleNode.add_data(3)
middleNode.add_data(4)
middleNode.add_data(5)
middleNode.print_nodes()
print(f"Middle Node :- {middleNode.middle_node()}")
