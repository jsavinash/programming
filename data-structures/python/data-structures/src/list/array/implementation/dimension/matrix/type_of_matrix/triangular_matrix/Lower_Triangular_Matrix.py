class LowerTriangularMatrix:
    def lower_triangular_matrix(self):
        return [[1, 1, 2, 4], [0, 1, 4, 5], [0, 0, 1, 3], [0, 0, 0, 3]]

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


lower_triangular_matrix = LowerTriangularMatrix()
lower_triangular_matrix.print(lower_triangular_matrix.lower_triangular_matrix())
