class SingletonMatrix:
    def singleton_matrix(self):
        return [1]  # Array that have single element is called singleton matrix.

    def print(self, matrix):
        print(matrix)


singleton_matrix = SingletonMatrix()
singleton_matrix.print(singleton_matrix.singleton_matrix())
