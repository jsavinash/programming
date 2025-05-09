# Matrix with m(Row) x n(Column). 
# Horizontal or row matrix : Where m equal to one and n must be greater then one.
class RowMatrix:
    def row_matrix(self):
        return [1, 2, 3, 4]  # 1 X 4

    def print(self, matrix):
        print(matrix)


row_matrix = RowMatrix()
row_matrix.print(row_matrix.row_matrix())
