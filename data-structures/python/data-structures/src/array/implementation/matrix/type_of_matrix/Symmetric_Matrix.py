# Normal matrix with m(Row) x n(Column). 
# Symmetric matrix : When matrix equal to transpose of matrix itself.
# Formula :- A = A(T)

class SymmetricMatrix:
    def matrix(self):  
        return [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
    
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


symmetricMatrix = SymmetricMatrix()
print("Symmetric matrix check :: ")
print(symmetricMatrix.matrix() == (symmetricMatrix.create_transpose_matrix(symmetricMatrix.matrix())))