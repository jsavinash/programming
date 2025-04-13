from abc import ABC, abstractmethod


class IDesignBrowserHistory(ABC):

    @property
    def back_stack(self):
        return

    @back_stack.setter
    def back_stack(self, val):
        pass

    @back_stack.deleter
    def back_stack(self):
        pass

    @property
    def back_stack_counter(self):
        return

    @back_stack_counter.setter
    def back_stack_counter(self, val):
        pass

    @back_stack_counter.deleter
    def back_stack_counter(self):
        pass

    @property
    def forward_stack(self):
        return

    @forward_stack.setter
    def forward_stack(self, val):
        pass

    @forward_stack.deleter
    def forward_stack(self):
        pass

    @property
    def forward_stack_counter(self):
        return

    @forward_stack_counter.setter
    def forward_stack_counter(self, val):
        pass

    @forward_stack_counter.deleter
    def forward_stack_counter(self):
        pass

    @abstractmethod
    def visit(self):
        pass

    @abstractmethod
    def forward(self, position):
        pass

    @abstractmethod
    def back(self, position):
        pass
