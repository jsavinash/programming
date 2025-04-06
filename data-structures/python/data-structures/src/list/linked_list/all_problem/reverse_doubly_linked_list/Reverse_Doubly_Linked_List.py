from src.list.linked_list.doubly_linked_list.Doubly_Linked_List import DoublyLinkedList
from src.list.linked_list.doubly_linked_list.implementation.Doubly_Linked_List_Node import DoublyLinkedListNode


class ReverseDoublyLinkedList(DoublyLinkedList):
    def reverse(self):
        temp_head = self.head
        temp_ref = None
        while temp_head is not None:
            new_node = DoublyLinkedListNode(temp_head.data)
            if temp_ref is None:
                temp_ref = new_node
            else:
                new_node.next = temp_ref
                temp_ref.prev = new_node
                temp_ref = new_node
            temp_head = temp_head.next
        self.head = temp_ref


print("Reverse doubly linked list ::")
reverseDoublyLinkedList = ReverseDoublyLinkedList()
reverseDoublyLinkedList.add_data(1)
reverseDoublyLinkedList.add_data(2)
reverseDoublyLinkedList.add_data(3)
reverseDoublyLinkedList.add_data(4)
print("Print head before reverse ::")
reverseDoublyLinkedList.print_nodes()
reverseDoublyLinkedList.reverse()
print("Print head after reverse ::")
reverseDoublyLinkedList.print_nodes()
