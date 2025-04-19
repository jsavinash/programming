class DiagonalMatrix:
    def diagonal_matrix(self):
        return [[1, 0, 0, 0], [0, 3, 0, 0], [0, 0, 8, 0], [0, 0, 0, 9]]

    def anti_diagonal_matrix(self):
        return [[0, 0, 0, 1], [0, 0, 7, 0], [0, 9, 0, 0], [11, 0, 0, 0]]

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


diagonal_matrix = DiagonalMatrix()
diagonal_matrix.print(diagonal_matrix.diagonal_matrix())
diagonal_matrix.print(diagonal_matrix.anti_diagonal_matrix())
