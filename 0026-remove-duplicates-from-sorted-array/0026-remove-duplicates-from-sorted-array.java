class Solution {
    public int removeDuplicates(int[] nums) {
        // int lastUniqueIndex = 0;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[lastUniqueIndex] != nums[i]){
        //         nums[lastUniqueIndex + 1 ] = nums[i];
        //         lastUniqueIndex ++;
        //     }
        // }
        // return lastUniqueIndex +1;
        int n=0;
        for(int i=1; i<nums.length; i++){
            if(nums[n] != nums[i]){
                nums[n +1 ] = nums[i];
                n++;
            }
        }
        return n +1;
    }
}