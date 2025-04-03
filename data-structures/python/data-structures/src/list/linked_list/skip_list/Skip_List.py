from src.list.linked_list.skip_list.ISkip_List import ISkipList
from src.list.linked_list.skip_list.Skip_List_Node import SkipListNode
import random


class SkipList(ISkipList):

    def __init__(self):
        self.P = 0.5;
        self.MAX_LEVEL = 5;
        self._head = SkipListNode(None, self.MAX_LEVEL)
        self.level = 0
        self.random = random.random()

    @property
    def head(self):
        return self._head

    @head.setter
    def head(self, val):
        self._head = val

    @head.deleter
    def head(self):
        del self._head

    def random_level(self):
        lvl = 0
        while random.random() < self.P and lvl < self.MAX_LEVEL:
            lvl += 1
        return lvl

    def add_data(self, val):
        last_element_of_all_level = [SkipListNode()] * (self.MAX_LEVEL + 1)
        current_head = self.head
        # Step - 1
        # Iterate level from high to low index.
        for x in range(self.level, -1, -1):
            while current_head is not None and current_head.down is not None and current_head.down[x].value is not None:
                current_head = current_head.down[x]
            last_element_of_all_level[x] = current_head

        # Step - 2
        # Identify random level and insert head not on level greater than current level.
        random_level = self.random_level()
        if random_level > self.level:
            for y in range(self.level + 1, random_level + 1):
                last_element_of_all_level[y] = self.head
            self.level = random_level

        # Step - 3
        # Insert newly created node and bind all last element from all level to newly created node.
        new_node = SkipListNode(val, self.level)
        for z in range(0, self.level + 1):
            if last_element_of_all_level is not None and last_element_of_all_level[z] is not None and \
                    last_element_of_all_level[z].down[z] is not None:
                new_node.down[z] = last_element_of_all_level[z].down[z]
                last_element_of_all_level[z].down[z] = new_node

    def print_all_nodes(self):
        tempHead = self.head
        for x in range(0, self.level + 1):
            print(f"Level :- {x}")
            node = tempHead.down[x]
            while node is not None and node.value is not None and node.down is not None and node.down[x]:
                print(node.value)
                node = node.down[x]
            print()


skipList = SkipList()
skipList.add_data(10)
skipList.add_data(20)
skipList.add_data(30)
skipList.print_all_nodes()
print("Completed")
