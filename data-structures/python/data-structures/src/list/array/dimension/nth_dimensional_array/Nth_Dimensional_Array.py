import array as arr


class NthDimensionalArray:
    def create_nxm_dimensional_array(self, row, column, val):
        local_arr = []
        for x in range(0, row):
            local_arr_2 = []
            for y in range(0, column):
                local_arr_2.append(val)
            local_arr.append(local_arr_2)
        return local_arr

    def print_nxm_dimensional_array(self, arr):
        print("[")
        for x in range(0,
                       len(arr)):
            print(arr[x], end="")
            print(",")
        print("]")

    def matrix_addition(self, arr, arr2):
        matrix = []
        for x in range(len(arr)):
            row = []
            for y in range(len(arr[0])):
                row.append(arr[x][y] + arr2[x][y])
            matrix.append(row)
        return matrix

    def matrix_substraction(self, arr, arr2):
        matrix = []
        for x in range(len(arr)):
            row = []
            for y in range(len(arr[0])):
                row.append(arr[x][y] - arr2[x][y])
            matrix.append(row)
        return matrix

    def get_dimension(self, arr):
        return [len(arr), len(arr[0])]


nth_dimensional_array = NthDimensionalArray()
result = nth_dimensional_array.create_nxm_dimensional_array(5, 4, 1)
result2 = nth_dimensional_array.create_nxm_dimensional_array(5, 4, 1)
nth_dimensional_array.print_nxm_dimensional_array(result)
print(nth_dimensional_array.get_dimension(result))
print(nth_dimensional_array.matrix_addition(result, result2))
result3 = nth_dimensional_array.create_nxm_dimensional_array(5, 4, 5)
result4 = nth_dimensional_array.create_nxm_dimensional_array(5, 4, 1)
print(nth_dimensional_array.matrix_substraction(result3, result4))
