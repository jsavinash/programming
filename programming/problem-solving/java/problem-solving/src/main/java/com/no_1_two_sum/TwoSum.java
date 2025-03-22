package com.no_1_two_sum;

import java.util.HashMap;

public class TwoSum {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        int outputNum[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int now = nums[i];
            int lookingFor = target - now;
            if(hashMap.containsKey(lookingFor)){
                outputNum[0] = hashMap.get(lookingFor);
                outputNum[1] = i;
                return outputNum;
            } else {
                hashMap.put(now, i);
            }
        }
        return outputNum;
    };

    public static void main(String args[]){
        int[] intputNums = {2,7,11,15};
        int target = 9;
        TwoSum twoSumObject = new TwoSum();
        int[] output = twoSumObject.twoSum(intputNums, target);
        System.out.println("(" + output[0] + "," + output[1] + ")");
    }
}
