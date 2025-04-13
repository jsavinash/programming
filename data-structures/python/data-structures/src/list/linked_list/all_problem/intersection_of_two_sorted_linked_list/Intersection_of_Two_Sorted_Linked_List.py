from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class IntersectionOfTwoSortedLinkedList(SinglyLinkedList):
    def intersection(self, head, head2):
        temp_head = head
        temp_head_2 = head2
        hash_set = set()
        while temp_head is not None:
            if temp_head.data not in hash_set:
                hash_set.add(temp_head.data)
            temp_head = temp_head.next

        while temp_head_2 is not None:
            if temp_head_2.data in hash_set:
                self.add_data(temp_head_2.data)
            temp_head_2 = temp_head_2.next

    def get_head_node(self):
        return self.head


intersectionOfTwoSortedLinkedList = IntersectionOfTwoSortedLinkedList()
intersectionOfTwoSortedLinkedList.add_data(1)
intersectionOfTwoSortedLinkedList.add_data(2)
intersectionOfTwoSortedLinkedList.add_data(3)
intersectionOfTwoSortedLinkedList.add_data(4)
intersectionOfTwoSortedLinkedList.add_data(6)
intersectionOfTwoSortedLinkedList2 = IntersectionOfTwoSortedLinkedList()
intersectionOfTwoSortedLinkedList2.add_data(2)
intersectionOfTwoSortedLinkedList2.add_data(4)
intersectionOfTwoSortedLinkedList2.add_data(6)
intersectionOfTwoSortedLinkedList2.add_data(8)
intersectionOfTwoSortedLinkedList3 = IntersectionOfTwoSortedLinkedList()
node = intersectionOfTwoSortedLinkedList.get_head_node()
node2 = intersectionOfTwoSortedLinkedList2.get_head_node()
intersectionOfTwoSortedLinkedList3.intersection(node,
                                                node2)
intersectionOfTwoSortedLinkedList3.print_nodes()
