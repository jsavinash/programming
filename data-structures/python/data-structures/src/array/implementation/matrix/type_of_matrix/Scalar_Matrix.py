# Matrix with m(Row) x n(Column). 
# Scalar matrix : Multiple identity matrix with constant number to get scalar vector.
# scalar matrix  = (constant X identity matrix)
class ScalarMatrix:
    def scalar_matrix(self):
        return [[2, 0, 0], [0, 2, 0], [0, 0, 2]]
    

    def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")

scalar_matrix = ScalarMatrix()
scalar_matrix.print(scalar_matrix.scalar_matrix())
