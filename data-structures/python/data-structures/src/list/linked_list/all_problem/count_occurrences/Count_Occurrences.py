from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class CountOccurrences(SinglyLinkedList):
    def count_occurrences(self, value):
        temp_head = self.head
        count = 0
        while temp_head is not None:
            if temp_head.data == value:
                count += 1
            temp_head = temp_head.next
        return count


countOccurrences = CountOccurrences()
print("Count Node Occurrences")
countOccurrences.add_data(1)
countOccurrences.add_data(5)
countOccurrences.add_data(5)
countOccurrences.add_data(5)
countOccurrences.add_data(5)
countOccurrences.print_nodes()
print(f"Count Occurrences :- {countOccurrences.count_occurrences(5)}")
