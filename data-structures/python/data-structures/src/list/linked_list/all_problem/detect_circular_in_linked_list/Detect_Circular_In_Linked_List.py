from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList
from src.list.linked_list.circular_linked_list.Circular_Singly_Linked_List import CircularSinglyLinkedList


class DetectCircularInLinkedListInSinglyLinkedList(SinglyLinkedList):
    def detect_circular_in_linked_list(self):
        circular_detected = False
        slow_pointer = self.head
        fast_pointer = self.head
        while (slow_pointer is not None and
               slow_pointer.next is not None and
               fast_pointer is not None and
               fast_pointer.next is not None and
               fast_pointer.next.next is not None):
            slow_pointer = slow_pointer.next
            fast_pointer = fast_pointer.next.next
            if slow_pointer == fast_pointer:
                circular_detected = True
                break
        return circular_detected


class DetectCircularInLinkedListInCircularSinglyLinkedList(CircularSinglyLinkedList):
    def detect_circular_in_linked_list(self):
        circular_detected = False
        slow_pointer = self.head
        fast_pointer = self.head
        while (slow_pointer is not None and
               slow_pointer.next is not None and
               fast_pointer is not None and
               fast_pointer.next is not None and
               fast_pointer.next.next is not None):
            slow_pointer = slow_pointer.next
            fast_pointer = fast_pointer.next.next
            if slow_pointer == fast_pointer:
                circular_detected = True
                break
        return circular_detected


detect_circular_in_linked_list_in_singly_linked_list = DetectCircularInLinkedListInSinglyLinkedList()
detect_circular_in_linked_list_in_singly_linked_list.add_data(1)
detect_circular_in_linked_list_in_singly_linked_list.add_data(2)
detect_circular_in_linked_list_in_singly_linked_list.add_data(3)
print("Detect Circular in singly linked list :- ")
print(detect_circular_in_linked_list_in_singly_linked_list.detect_circular_in_linked_list())

detect_circular_in_linked_list_in_circular_singly_linked_list = DetectCircularInLinkedListInCircularSinglyLinkedList()
detect_circular_in_linked_list_in_circular_singly_linked_list.add_data(1)
detect_circular_in_linked_list_in_circular_singly_linked_list.add_data(2)
detect_circular_in_linked_list_in_circular_singly_linked_list.add_data(3)
print("Detect Circular in circular singly linked list :- ")
print(detect_circular_in_linked_list_in_circular_singly_linked_list.detect_circular_in_linked_list())
