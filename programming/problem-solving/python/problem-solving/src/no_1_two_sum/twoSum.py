def twoSum(nums, target):
    dictStore = {}
    for index, item in enumerate(nums):
        now = item
        looking_for = target - now
        found = dictStore.get(looking_for)
        if found != None and found > -1:
            return [dictStore.get(looking_for), index]
        else:
            dictStore[now] = index
    return [-1, -1]


print(twoSum([3, 1, 2, 4], 3))
