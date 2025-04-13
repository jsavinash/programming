from src.list.linked_list.doubly_linked_list.Doubly_Linked_List import DoublyLinkedList


class RemoveDuplicateFromLinkedList(DoublyLinkedList):
    def __init__(self, head=None, tail=None):
        super().__init__(head, tail)
        self.temp_head_ref = None

    def remove_duplicate(self):
        temp_head_ref = self.head
        hash_map = {}
        self.head = None
        while temp_head_ref is not None:
            if temp_head_ref.data not in hash_map:
                hash_map[temp_head_ref.data] = temp_head_ref
                self.add_data(temp_head_ref.data)
            temp_head_ref = temp_head_ref.next


print("Remove duplicate nodes ::")
remove_duplicate_from_linked_list = RemoveDuplicateFromLinkedList()
remove_duplicate_from_linked_list.add_data(11)
remove_duplicate_from_linked_list.add_data(11)
remove_duplicate_from_linked_list.add_data(11)
remove_duplicate_from_linked_list.add_data(21)
remove_duplicate_from_linked_list.add_data(43)
remove_duplicate_from_linked_list.add_data(43)
remove_duplicate_from_linked_list.add_data(60)
remove_duplicate_from_linked_list.remove_duplicate()
remove_duplicate_from_linked_list.print_nodes()
