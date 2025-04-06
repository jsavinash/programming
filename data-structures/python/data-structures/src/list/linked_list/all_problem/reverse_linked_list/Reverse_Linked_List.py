from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList
from src.list.linked_list.singly_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


class ReverseSinglyLinkedList(SinglyLinkedList):
    def reverse(self):
        temp_head = self.head
        temp_ref = None
        while temp_head is not None:
            new_node = SinglyLinkedListNode(temp_head.data)
            if temp_ref is None:
                temp_ref = new_node
            else:
                new_node.next = temp_ref
                temp_ref = new_node
            temp_head = temp_head.next
            self.head = temp_ref


print("Reverse singly linked list ::")
reverseSinglyLinkedList = ReverseSinglyLinkedList()
reverseSinglyLinkedList.add_data(1)
reverseSinglyLinkedList.add_data(2)
reverseSinglyLinkedList.add_data(3)
reverseSinglyLinkedList.add_data(4)
reverseSinglyLinkedList.reverse()
reverseSinglyLinkedList.print_nodes()
