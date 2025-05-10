# Matrix with m(Row) x n(Column).
# Diagonal matrix : Multiplication of matrix and it's transpose will give identity matrix.
class DiagonalMatrix:
    def matrix(self):
        return [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    def create_transpose_matrix(self, matrix):
        new_matrix = []
        row = len(matrix)
        col = len(matrix[0])
        for x_col in range(col):
            x_new_row = []
            for x_row in range(row):
                x_new_row.append(matrix[x_row][x_col])
            new_matrix.append(x_new_row)
        return new_matrix

    def multiply_matrix(self, matrix, matrix_2):
        new_matrix = []
        new_row = []
        sum = 0
        for w in range(matrix):
            for x in range(matrix[0]):
                for y in range(matrix_2):
                    for z in range(matrix_2[0]):
                        sum = sum + matrix[w][x] * matrix_2[z][y]
        new_row.append(sum)
        return new_matrix

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


diagonal_matrix = DiagonalMatrix()
matrix = diagonal_matrix.matrix()
matrix_transpose = diagonal_matrix.create_transpose_matrix(diagonal_matrix.matrix())
multiply_matrix = diagonal_matrix.multiply_matrix(matrix, matrix_transpose)
diagonal_matrix.print(matrix)
diagonal_matrix.print(matrix_transpose)
diagonal_matrix.print(multiply_matrix)
