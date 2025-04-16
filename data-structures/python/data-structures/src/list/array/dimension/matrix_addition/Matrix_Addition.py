class MatrixAddition:
    def add_square_matrix(self, matrix, matrix_2):
        new_matrix = []
        for x in range(0, len(matrix)):
            new_matrix_row = []
            for y in range(0, len(matrix[0])):
                new_matrix_row.append(matrix[x][y] + matrix_2[x][y])
            new_matrix.append(new_matrix_row)
        return new_matrix

    # Closure Property of Matrix Addition :- addition only possible if both are of same dimension
    def closure_property_of_matrix_addition(self, matrix, matrix_2):
        return self.matrix_dimension(matrix) == self.matrix_dimension(matrix_2)

    # Commutative Property of Matrix Addition
    # A + B = B + A
    def commutative_property_of_matrix_addition(self, matrix, matrix_2):
        return self.add_square_matrix(matrix, matrix_2) == self.add_square_matrix(matrix_2, matrix)

    # Associative Property of Matrix Addition
    # A + (B + C) = (A + B) + C
    def associative_property_of_matrix_addition(self, matrix, matrix_2, matrix_3):
        LHS = self.add_square_matrix(matrix, self.add_square_matrix(matrix_2, matrix_3))
        RHS = self.add_square_matrix(self.add_square_matrix(matrix, matrix_2), matrix_3)
        return LHS == RHS

    # Additive Identity Property of Matrix Addition
    # A + O = A = O + A
    def additive_identity_property_of_matrix_addition(self, matrix, identity_matrix):
        LHS = self.add_square_matrix(matrix, identity_matrix)
        RHS = self.add_square_matrix(identity_matrix, matrix)
        return LHS == RHS == matrix

        # Additive Identity Property of Matrix Addition
        # A + O = A = O + A

    def additive_inverse_property_of_matrix_addition(self, matrix, inverse_matrix, identity_matrix):
        sum = self.add_square_matrix(matrix, inverse_matrix)
        return sum == identity_matrix

    def matrix_dimension(self, matrix):
        return [len(matrix), len(matrix[0])]


matrix_addition = MatrixAddition()
matrix = [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
matrix_2 = [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
matrix_3 = [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
inverse_matrix = [[-1, -1, -1], [-1, -1, -1], [-1, -1, -1]]
identity_matrix = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
addition = matrix_addition.add_square_matrix(matrix, matrix_2)
print(addition)
print(matrix_addition.closure_property_of_matrix_addition(matrix, matrix_2))
print(matrix_addition.commutative_property_of_matrix_addition(matrix, matrix_2))
print(matrix_addition.associative_property_of_matrix_addition(matrix, matrix_2, matrix_3))
print(matrix_addition.additive_identity_property_of_matrix_addition(matrix, identity_matrix))
print(matrix_addition.additive_inverse_property_of_matrix_addition(matrix, inverse_matrix, identity_matrix))
