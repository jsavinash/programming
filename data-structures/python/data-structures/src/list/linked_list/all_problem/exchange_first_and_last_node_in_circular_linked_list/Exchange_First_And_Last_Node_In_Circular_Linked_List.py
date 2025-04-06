from src.list.linked_list.circular_linked_list.Circular_Singly_Linked_List import CircularSinglyLinkedList


class ExchangeFirstAndLastNodeInCircularLinkedList(CircularSinglyLinkedList):
    def swap_first_and_last_node_in_circular_singly_linked_list(self):
        temp_tail = self.head
        loop_continue = True
        while loop_continue:
            if temp_tail.next == self.head:
                loop_continue = False
            else:
                temp_tail = temp_tail.next
        tail_data = temp_tail.data
        temp_tail.data = self.head.data
        self.head.data = tail_data


print("Exchange first and last node in circular linked list ::")
exchangeFirstAndLastNodeInCircularLinkedList = ExchangeFirstAndLastNodeInCircularLinkedList()
exchangeFirstAndLastNodeInCircularLinkedList.add_data(1)
exchangeFirstAndLastNodeInCircularLinkedList.add_data(2)
exchangeFirstAndLastNodeInCircularLinkedList.add_data(3)
exchangeFirstAndLastNodeInCircularLinkedList.swap_first_and_last_node_in_circular_singly_linked_list()
exchangeFirstAndLastNodeInCircularLinkedList.print_nodes()
