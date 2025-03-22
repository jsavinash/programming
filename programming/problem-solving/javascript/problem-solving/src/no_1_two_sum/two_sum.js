const twoSum = (nums, target) => {
    const object = {};
    for (var i = 0; i < nums.length; i++) {
        const now = nums[i];
        const lookingFor = target - now;
        if (object[lookingFor] >= -1) {
            return [object[lookingFor], i];
        } else
            object[now] = i;

    }
    return [-1, -1];
}

console.log(twoSum([4, 1, 2, 3], 3));