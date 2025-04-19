# Null or Zero matrix
class NullMatrix:
    def null_matrix(self):
        return [0, 0, 0, 0]

    def print(self, matrix):
        print(matrix)


null_matrix = NullMatrix()
null_matrix.print(null_matrix.null_matrix())
