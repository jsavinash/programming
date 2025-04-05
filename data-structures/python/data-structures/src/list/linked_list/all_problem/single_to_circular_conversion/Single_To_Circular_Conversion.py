from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList
from src.list.linked_list.all_problem.detect_circular_in_linked_list.Detect_Circular_In_Linked_List import \
    DetectCircularInLinkedListInSinglyLinkedList


class SingleToCircularConversion(DetectCircularInLinkedListInSinglyLinkedList):
    def single_to_circular_conversion(self):
        temp_head = self.head
        temp_tail = self.head
        while temp_tail is not None and temp_tail.next is not None:
            temp_tail = temp_tail.next
        temp_tail.next = temp_head


print("Single To Circular Conversion")
singleToCircularConversion = SingleToCircularConversion()
singleToCircularConversion.add_data(100)
singleToCircularConversion.add_data(200)
singleToCircularConversion.add_data(300)
singleToCircularConversion.add_data(400)
singleToCircularConversion.single_to_circular_conversion()
print(singleToCircularConversion.detect_circular_in_linked_list())
