from abc import ABC


# Skip list condition as follows :-
# 1) Shorted list

class ISkipList(ABC):

    @property
    def head(self):
        return

    @head.setter
    def head(self, val):
        pass

    @head.deleter
    def head(self):
        pass

    def add_data(self, val):
        pass
