import array as arr


class OneDimensionalArray:
    def __init__(self):
        self.arr = arr.array("i")
        self.current_size = 0

    def add(self, data):
        self.arr.append(data)
        self.current_size += 1

    def remove(self):
        if len(self.arr) > 0:
            self.arr.pop()

    def print(self):
        if len(self.arr) > 0:
            for x in self.arr:
                print(x)


one_dimensional_array = OneDimensionalArray()
one_dimensional_array.add(1)
one_dimensional_array.add(2)
one_dimensional_array.add(3)
one_dimensional_array.add(4)
one_dimensional_array.add(5)
one_dimensional_array.add(6)
one_dimensional_array.print()
