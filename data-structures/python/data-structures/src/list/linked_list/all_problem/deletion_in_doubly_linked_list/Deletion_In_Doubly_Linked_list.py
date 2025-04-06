from src.list.linked_list.doubly_linked_list.Doubly_Linked_List import DoublyLinkedList


class DeletionInDoublyLinkedList(DoublyLinkedList):
    def delete_node_in_doubly_linked_list(self, data):
        temp_tail = self.head
        node_found = None
        while temp_tail is not None:
            if temp_tail.data == data:
                node_found = temp_tail
                break
            else:
                temp_tail = temp_tail.next
        prev_node = node_found.prev
        next_node = node_found.next
        prev_node.next = next_node
        next_node.prev = prev_node


print("Delete node in doubly linked list ::")
deletionInDoublyLinkedList = DeletionInDoublyLinkedList()
deletionInDoublyLinkedList.add_data(1)
deletionInDoublyLinkedList.add_data(2)
deletionInDoublyLinkedList.add_data(3)
deletionInDoublyLinkedList.delete_node_in_doubly_linked_list(2)
deletionInDoublyLinkedList.print_nodes()
