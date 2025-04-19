class RectangularMatrix:
    def rectangular_matrix(self):
        return [[1, 2], [3, 4], [5, 6], [7, 8]]  # 4 X 2

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")

    def is_rectangular_matrix(self, matrix):
        return len(matrix) != len(matrix[0])


rectangular_matrix = RectangularMatrix()
rectangular_matrix.print(rectangular_matrix.rectangular_matrix())
print(rectangular_matrix.is_rectangular_matrix(rectangular_matrix.rectangular_matrix()))
