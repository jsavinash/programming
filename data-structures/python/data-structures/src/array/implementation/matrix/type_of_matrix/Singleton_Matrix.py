# Matrix with m(Row) x n(Column). 
# Singleton matrix : Matrix that have one element.
class SingletonMatrix:
    def singleton_matrix(self):
        return [1]  

    def print(self, matrix):
        print(matrix)


singleton_matrix = SingletonMatrix()
singleton_matrix.print(singleton_matrix.singleton_matrix())
