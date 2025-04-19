class UpperTriangularMatrix:
    def upper_triangular_matrix(self):
        return [[1, 0, 0, 0], [2, 1, 0, 0], [4, 3, 1, 0], [3, 2, 1, 3]]

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


upper_triangular_matrix = UpperTriangularMatrix()
upper_triangular_matrix.print(upper_triangular_matrix.upper_triangular_matrix())
