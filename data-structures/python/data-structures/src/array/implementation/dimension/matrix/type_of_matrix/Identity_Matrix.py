# Matrix with m(Row) x n(Column). 
# Identity matrix : Digonal element are same, rest all element ares zero.
class IdentityMatrix:
    def identity_matrix(self):  
        return [[1, 0, 0], [0, 1, 0], [0, 0, 1]]

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


identity_matrix = IdentityMatrix()
identity_matrix.print(identity_matrix.identity_matrix())
