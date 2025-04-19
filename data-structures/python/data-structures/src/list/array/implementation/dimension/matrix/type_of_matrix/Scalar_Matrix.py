class ScalarMatrix:
    def scalar_matrix(self):  # Diagonal element must be same and remaining element zeros.
        return [[2, 0, 0], [0, 2, 0], [0, 0, 2]]

    # Constant X identity matrix = scalar matrix

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")

scalar_matrix = ScalarMatrix()
scalar_matrix.print(scalar_matrix.scalar_matrix())
