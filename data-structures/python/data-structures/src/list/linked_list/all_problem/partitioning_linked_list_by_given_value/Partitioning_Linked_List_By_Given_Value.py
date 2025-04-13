from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList
from src.list.linked_list.singly_linked_list.implementation.Singly_Linked_List_Node import SinglyLinkedListNode


class PartitioningLinkedListByGivenValue(SinglyLinkedList):
    def partition_linked_list(self, x):
        temp_head = self.head
        temp_list = None
        temp_list_2 = None
        head_ref = None
        head_ref_2 = None
        while temp_head is not None:
            new_node = SinglyLinkedListNode(temp_head.data)
            if temp_head.data <= x:
                if temp_list is None:
                    head_ref = temp_list = new_node
                else:
                    temp_list.next = new_node
                    temp_list = new_node
            else:
                if temp_list_2 is None:
                    head_ref_2 = temp_list_2 = new_node
                else:
                    temp_list_2.next = new_node
                    temp_list_2 = temp_list_2
            temp_head = temp_head.next
        if temp_list is not None:
            temp_list.next = head_ref_2
        self.head = head_ref

#1 -> 4 -> 3 -> 2 -> 5 -> 2 -> 3, x = 3
partitioningLinkedListByGivenValue = PartitioningLinkedListByGivenValue()
partitioningLinkedListByGivenValue.add_data(1)
partitioningLinkedListByGivenValue.add_data(4)
partitioningLinkedListByGivenValue.add_data(3)
partitioningLinkedListByGivenValue.add_data(2)
partitioningLinkedListByGivenValue.add_data(5)
partitioningLinkedListByGivenValue.add_data(2)
partitioningLinkedListByGivenValue.add_data(3)
partitioningLinkedListByGivenValue.partition_linked_list(3)
partitioningLinkedListByGivenValue.print_nodes()

