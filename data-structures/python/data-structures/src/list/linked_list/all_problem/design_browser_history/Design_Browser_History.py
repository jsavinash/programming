from src.list.linked_list.all_problem.design_browser_history.IDesign_Browser_History import IDesignBrowserHistory
from src.list.linked_list.doubly_linked_list.implementation.Doubly_Linked_List_Node import DoublyLinkedListNode


class DesignBrowserHistory(IDesignBrowserHistory):

    def __init__(self):
        self._forward_stack = None
        self._back_stack = None
        self._back_stack_counter = 0
        self._forward_stack_counter = 0

    @property
    def back_stack(self):
        return self._back_stack

    @back_stack.setter
    def back_stack(self, val):
        self._back_stack = val

    @back_stack.deleter
    def back_stack(self):
        del self._back_stack

    @property
    def back_stack_counter(self):
        return self._back_stack_counter

    @back_stack_counter.setter
    def back_stack_counter(self, val):
        self._back_stack_counter = val

    @back_stack_counter.deleter
    def back_stack_counter(self):
        del self._back_stack_counter

    @property
    def forward_stack(self):
        return self._forward_stack

    @forward_stack.setter
    def forward_stack(self, val):
        self._forward_stack = val

    @forward_stack.deleter
    def forward_stack(self):
        del self._forward_stack

    @property
    def forward_stack_counter(self):
        return self._forward_stack_counter

    @forward_stack_counter.setter
    def forward_stack_counter(self, val):
        self._forward_stack_counter = val

    @forward_stack_counter.deleter
    def forward_stack_counter(self):
        del self._forward_stack_counter

    def back_stack_add_node(self, data):
        new_node = DoublyLinkedListNode(data)
        if self.back_stack is None:
            self.back_stack = new_node
        else:
            self.back_stack.next = new_node
            new_node.prev = self.back_stack
            self.back_stack = new_node
        self.back_stack_counter += 1

    def back_stack_remove_recently_added_node(self):
        if self.back_stack.prev is not None:
            self.back_stack = self.back_stack.prev
            self.back_stack.next = None
            self.back_stack_counter -= 1

    def forward_stack_add_node(self, data):
        new_node = DoublyLinkedListNode(data)
        if self.forward_stack is None:
            self.forward_stack = new_node
        else:
            self.forward_stack.next = new_node
            new_node.prev = self.forward_stack
            self.forward_stack = new_node
        self.forward_stack_counter += 1

    def forward_stack_remove_recently_added_node(self):
        if self.forward_stack_counter > 0:
            self.forward_stack = self.forward_stack.prev
            self.forward_stack.next = None
            self.forward_stack_counter -= 1

    def visit(self, data):
        if self.forward_stack is not None:
            self.forward_stack = None
        self.back_stack_add_node(data)

    def back(self, position):
        for x in range(position):
            if self.back_stack_counter > 1:
                data = self._back_stack.data
                self.forward_stack_add_node(data)
                self.back_stack_remove_recently_added_node()

    def forward(self, position):
        if self.forward_stack is not None:
            for x in range(position):
                if self.back_stack_counter > 1:
                    data = self._forward_stack.data
                    self.forward_stack_remove_recently_added_node()
                    self.back_stack_add_node(data)
        else:
            pass

    def print_navigation_back_stack(self):
        back = self.back_stack
        while back is not None:
            print(back.data)
            back = back.prev

    def print_navigation_forward_stack(self):
        forward = self.forward_stack
        while forward is not None:
            print(forward.data)
            forward = forward.prev


print("Design browser stack ::")
design_browser_history = DesignBrowserHistory()
design_browser_history.visit("www.gfg.org")
design_browser_history.visit("www.google.com")
design_browser_history.visit("www.fb.com")
design_browser_history.visit("www.yt.com")
design_browser_history.back(1)
design_browser_history.back(1)
design_browser_history.forward(1)
design_browser_history.visit("www.linkedln.com")
design_browser_history.forward(2)
design_browser_history.back(2)
design_browser_history.back(7)
print("Print back stack ::")
design_browser_history.print_navigation_back_stack()
print("Print forward stack ::")
design_browser_history.print_navigation_forward_stack()
