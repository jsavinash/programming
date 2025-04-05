from src.list.linked_list.circular_linked_list.Circular_Singly_Linked_List import CircularSinglyLinkedList


class DeleteNodeFromCircularLinkedList(CircularSinglyLinkedList):
    def delete_node_from_circular_linked_list(self, data):
        temp_head = self.head
        loop_temp_head = self.head
        self.head = self.tail = None
        while temp_head is not None:
            if temp_head.data != data:
                self.add_data(temp_head.data)
            if temp_head.next == loop_temp_head:
                temp_head = None
            else:
                temp_head = temp_head.next


deleteNodeFromCircularLinkedList = DeleteNodeFromCircularLinkedList()
deleteNodeFromCircularLinkedList.add_data(10)
deleteNodeFromCircularLinkedList.add_data(20)
deleteNodeFromCircularLinkedList.add_data(30)
deleteNodeFromCircularLinkedList.add_data(40)
print("Detect Circular in circular singly linked list :- ")
print(deleteNodeFromCircularLinkedList.delete_node_from_circular_linked_list(30))
deleteNodeFromCircularLinkedList.print_nodes()
