from src.list.linked_list.circular_linked_list.Circular_Singly_Linked_List import CircularSinglyLinkedList


class CountNodeInCircularLinkedList(CircularSinglyLinkedList):
    def count_node_in_circular_linked_list(self):
        temp_head = self.head
        counter = 0
        while temp_head is not None:
            if temp_head.next == self.head:
                temp_head = None
            else:
                temp_head = temp_head.next
            counter += 1
        return counter


countNodeInCircularLinkedList = CountNodeInCircularLinkedList()
countNodeInCircularLinkedList.add_data(1)
countNodeInCircularLinkedList.add_data(2)
countNodeInCircularLinkedList.add_data(3)
countNodeInCircularLinkedList.add_data(4)
print("Count node in circular linked list :- ")
print(countNodeInCircularLinkedList.count_node_in_circular_linked_list())
