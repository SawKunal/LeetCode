import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.size(); i++) {
        //     for (int j = i + 1; j < nums.size(); j++) {
        //         if (nums[j] == target - nums[i]) {
        //             return {i, j};
        //         }
        //     }
        // }
        // // Return an empty vector if no solution is found
        // return {};
        Hashtable<Integer, Integer> numbersFound = new Hashtable<>();
        for(int i=0; i<nums.length; i++){
            int complement = target -  nums[i];
            if(numbersFound.containsKey(complement)){
                return new int[]{numbersFound.get(complement), i};
            }
            numbersFound.put(nums[i], i);
        }
        return null;
    }
}