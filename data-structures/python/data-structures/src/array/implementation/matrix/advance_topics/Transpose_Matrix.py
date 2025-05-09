# Normal matrix with m(Row) x n(Column). 
# Transpose matrix : move all rows in place of columns and vice verse.
class TransposeMatrix:
     def normal_matrix(self):  
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
     
     def print(self, matrix):
        print("[")
        for x in range(len(matrix)):
            print(matrix[x])
        print("]")


transposeMatrix = TransposeMatrix()
transposeMatrix.print(transposeMatrix.normal_matrix())
transposeMatrix.print(transposeMatrix.create_transpose_matrix(transposeMatrix.normal_matrix()))

    

     

