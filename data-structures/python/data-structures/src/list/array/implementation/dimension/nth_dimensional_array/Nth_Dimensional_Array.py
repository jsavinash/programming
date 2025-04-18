class NthDimensionalArray:
    def create_nxm_square_matrix(self, row, column, val):
        local_arr = []
        for x in range(0, row):
            local_arr_2 = []
            for y in range(0, column):
                local_arr_2.append(val)
            local_arr.append(local_arr_2)
        return local_arr

    def print_nxm_square_matrix(self, arr):
        print("[")
        for x in range(0,
                       len(arr)):
            print(arr[x], end="")
            print(",")
        print("]")


nth_dimensional_array = NthDimensionalArray()
result = nth_dimensional_array.create_nxm_square_matrix(5, 4, 1)
result2 = nth_dimensional_array.create_nxm_square_matrix(6, 2, 1)
nth_dimensional_array.print_nxm_square_matrix(result)
nth_dimensional_array.print_nxm_square_matrix(result2)
