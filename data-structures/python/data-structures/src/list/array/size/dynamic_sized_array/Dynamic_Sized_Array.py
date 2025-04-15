import array as arr


class DynamicSizedArray:
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


dynamic_sized_array = DynamicSizedArray()
dynamic_sized_array.add(1)
dynamic_sized_array.add(2)
dynamic_sized_array.add(3)
dynamic_sized_array.add(4)
dynamic_sized_array.add(5)
dynamic_sized_array.add(6)
dynamic_sized_array.print()
