# Matrix with m(Row) x n(Column). 
# Column or vertical matrix : Where n equal to one and m must be greater then one.
class ColumnMatrix:
    def column_matrix(self):
        return [[1, 2, 3, 4]]  # 4 X 1

    def print(self, matrix):
        print(matrix)


column_matrix = ColumnMatrix()
column_matrix.print(column_matrix.column_matrix())
