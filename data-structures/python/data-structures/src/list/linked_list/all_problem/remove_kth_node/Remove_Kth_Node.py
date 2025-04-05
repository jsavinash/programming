from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class RemoveKthNode(SinglyLinkedList):
    def remove_kth_node(self, kth_node):
        current = self.head
        current_count = 1
        self.head = None
        while current is not None:
            if current_count % kth_node != 0:
                self.add_data(current.data)
            current_count += 1
            current = current.next


removeKthNode = RemoveKthNode()
print("Remove kth Node")
removeKthNode.add_data(1)
removeKthNode.add_data(2)
removeKthNode.add_data(3)
removeKthNode.add_data(4)
removeKthNode.add_data(5)
removeKthNode.add_data(6)
removeKthNode.add_data(7)
removeKthNode.add_data(8)
removeKthNode.remove_kth_node(3)
removeKthNode.print_nodes()
