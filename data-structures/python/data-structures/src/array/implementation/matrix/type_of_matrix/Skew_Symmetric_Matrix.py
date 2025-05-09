# Normal matrix with m(Row) x n(Column).
# skew symmetric matrix : When negative matrix equal to transpose of matrix itself.
# Formula :- A(T) = -A


class SkewSymmetricMatrix:
    def matrix(self):
        return [[0, 3, -8], [-3, 0, 6], [8, -6, 0]]

    def negation_matrix(self, matrix):
        new_matrix = []
        for row in range(len(matrix)):
            new_row = []
            for col in range(len(matrix[0])):
                new_row.append(-matrix[row][col])
            new_matrix.append(new_row)
        return new_matrix

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

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


skewSymmetricMatrix = SkewSymmetricMatrix()
print("Skew symmetric matrix check :: ")
print(
    skewSymmetricMatrix.negation_matrix(skewSymmetricMatrix.matrix())
    == (skewSymmetricMatrix.create_transpose_matrix(skewSymmetricMatrix.matrix()))
)
