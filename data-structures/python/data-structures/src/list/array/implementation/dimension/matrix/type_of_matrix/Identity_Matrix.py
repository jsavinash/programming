class IdentityMatrix:
    def identity_matrix(self):  # Diagonal element must be same and remaining element zeros.
        return [[1, 0, 0], [0, 1, 0], [0, 0, 1]]

    # Constant X identity matrix = scalar matrix

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


identity_matrix = IdentityMatrix()
identity_matrix.print(identity_matrix.identity_matrix())
