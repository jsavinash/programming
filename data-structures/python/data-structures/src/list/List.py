from abc import ABC, abstractmethod


# creating interface
class IList(ABC):
    @abstractmethod
    def add(self, data):
        pass

    @abstractmethod
    def remove(self, data):
        pass

    @abstractmethod
    def insert(self, index, data):
        pass


class List(IList):
    currentIdx = 0
    list = []

    def __init__(self):
        self.list = []

    def add(self, data):
        self.list.append(data)

    def remove(self, data):
        self.list.remove(data)

    def insert(self, index, data):
        self.list.insert(index, data)

    def print(self):
        for x in self.list:
            print(x)

    def __iter__(self):
        self.currentIdx = 0
        return self

    def __next__(self):
        currentValue = self.list[self.currentIdx]
        self.currentIdx += 1
        return currentValue


listObject = List()
listIterator = iter(listObject)
listObject.add(10)
listObject.add(11)
listObject.add(12)
listObject.remove(10)
listObject.insert(0, 99)
listObject.print()

print(next(listIterator))
print(next(listIterator))
