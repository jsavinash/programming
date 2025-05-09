class Addition:
    def square_matrix_addition(self, matrix, matrix_2):
        new_matrix = []
        for x in range(len(matrix)):
            new_matrix_row = []
            for y in range(len(matrix[0])):
                new_matrix_row.append(matrix[x][y] + matrix_2[x][y])
            new_matrix.append(new_matrix_row)
        return new_matrix


addition = Addition()
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
matrix_2 = [[7, 8, 9], [4, 5, 6], [1, 2, 3]]
print(addition.square_matrix_addition(matrix, matrix_2))
