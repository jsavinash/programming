from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class PairwiseSwapNodeInLinkedList(SinglyLinkedList):
    def pairwise_swap_node(self):
        temp_node = self.head
        while temp_node is not None and temp_node.next is not None:
            if temp_node is not None and temp_node.next is not None:
                current_node = temp_node
                next_node = temp_node.next
                current_node_data = temp_node.data
                current_node.data = next_node.data
                next_node.data = current_node_data
            temp_node = temp_node.next.next


print("Pairwise node swap ::")
pairwiseSwapNodeInLinkedList = PairwiseSwapNodeInLinkedList()
pairwiseSwapNodeInLinkedList.add_data(1)
pairwiseSwapNodeInLinkedList.add_data(2)
pairwiseSwapNodeInLinkedList.add_data(3)
pairwiseSwapNodeInLinkedList.add_data(4)
pairwiseSwapNodeInLinkedList.add_data(5)
pairwiseSwapNodeInLinkedList.add_data(6)
print("Node before swap ::")
pairwiseSwapNodeInLinkedList.print_nodes()
print("Node after swap ::")
pairwiseSwapNodeInLinkedList.pairwise_swap_node()
pairwiseSwapNodeInLinkedList.print_nodes()
