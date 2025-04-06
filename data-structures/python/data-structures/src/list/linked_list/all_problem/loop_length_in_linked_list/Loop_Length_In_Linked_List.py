from src.list.linked_list.singly_linked_list.Singly_Linked_List import SinglyLinkedList


class LoopLengthInLinkedList(SinglyLinkedList):
    def insert_loop_at_node(self, data):
        temp_head = self.head
        find_index_node = None
        while temp_head is not None:
            if temp_head.data == data:
                find_index_node = temp_head
            temp_head = temp_head.next
        self.tail.next = find_index_node

    def detect_loop_length(self):
        temp_head = self.head
        list_store = []  # Set in python
        loop_length = 0
        while temp_head is not None:
            if id(temp_head) not in list_store:
                list_store.append(id(temp_head))
            else:
                loop_length = len(list_store) - (list_store.index(id(temp_head)))
                break
            temp_head = temp_head.next
        return loop_length


loopLengthInLinkedList = LoopLengthInLinkedList()

print("Detect loop length in linked list ::")
loopLengthInLinkedList.add_data(25)
loopLengthInLinkedList.add_data(14)
loopLengthInLinkedList.add_data(19)
loopLengthInLinkedList.add_data(33)
loopLengthInLinkedList.add_data(10)
loopLengthInLinkedList.add_data(21)
loopLengthInLinkedList.add_data(39)
loopLengthInLinkedList.add_data(90)
loopLengthInLinkedList.add_data(58)
loopLengthInLinkedList.add_data(45)
loopLengthInLinkedList.insert_loop_at_node(33)
print(loopLengthInLinkedList.detect_loop_length())
