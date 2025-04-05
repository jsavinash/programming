from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class SingleToCircularConversion(SinglyLinkedList):
    def single_to_circular_conversion(self):
        temp_head = self.head
        temp_tail = self.head
        while temp_tail is not None:
            temp_tail = temp_tail.next
        temp_tail.next = temp_head
