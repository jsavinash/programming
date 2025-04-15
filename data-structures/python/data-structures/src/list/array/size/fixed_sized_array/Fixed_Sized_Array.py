import array as arr


class ArrayStorageCapacityLimitExceeded(Exception):
    def __init__(self, message):
        super().__init__(message)


class FixedSizedArray:
    def __init__(self, size=0):
        self.size = size
        self.arr = arr.array("i")
        self.current_size = 0

    def add(self, data):
        if self.current_size < self.size:
            self.arr.append(data)
            self.current_size += 1
        else:
            raise ArrayStorageCapacityLimitExceeded("Array storage capacity limit Exceeded")

    def remove(self):
        if len(self.arr) > 0:
            self.arr.pop()

    def print(self):
        if len(self.arr) > 0:
            for x in self.arr:
                print(x)


fixed_sized_array = FixedSizedArray(5)
fixed_sized_array.add(1)
fixed_sized_array.add(2)
fixed_sized_array.add(3)
fixed_sized_array.add(4)
fixed_sized_array.add(5)
fixed_sized_array.print()
