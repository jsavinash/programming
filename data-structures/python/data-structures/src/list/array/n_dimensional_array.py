import array as arr

numbers = arr.array('i', [10, 20, 30])
print(len(numbers))
for x in numbers:
    print(x)

for x in range(0, len(numbers)):
    print(numbers[x])

print(numbers.index(10))

print(numbers[:3])
print(numbers[1:])
print(numbers[1:2])
numbers.append(40)
numbers.extend([50, 60])
numbers.insert(0, 70)
numbers.remove(70)
print(numbers[:6])
numbers.pop(0)
print(numbers[:6])

