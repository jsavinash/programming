from src.list.linked_list.circular_linked_list.Circular_Singly_Linked_List import CircularSinglyLinkedList

###
class CircularLinkedListTraversal(CircularSinglyLinkedList):
    def traversal(self):
        temp_head = self.head
        while temp_head is not None:
            print(f"{temp_head.data} => ", end="")
            if temp_head.next == self.head:
                temp_head = None
            else:
                temp_head = temp_head.next

        print()


circularLinkedListTraversal = CircularLinkedListTraversal()
print("Circular Linked List Traversal")
circularLinkedListTraversal.add_data(1)
circularLinkedListTraversal.add_data(5)
circularLinkedListTraversal.add_data(5)
circularLinkedListTraversal.add_data(5)
circularLinkedListTraversal.add_data(6)
circularLinkedListTraversal.traversal()
