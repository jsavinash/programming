class SquareMatrix:
    def square_matrix(self):
        return [[1, 2], [3, 4]]  # 2 X 2

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")

    def is_square_matrix(self, matrix):
        return len(matrix) == len(matrix[0])


square_matrix = SquareMatrix()
square_matrix.print(square_matrix.square_matrix())
print(square_matrix.is_square_matrix(square_matrix.square_matrix()))
