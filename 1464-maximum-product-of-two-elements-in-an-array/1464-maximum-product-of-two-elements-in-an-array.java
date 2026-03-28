class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int firstMax = nums[nums.length -1];
        // int secondMax = nums[nums.length -2];
        // int result = (firstMax -1) * (secondMax -1);
        // return result;

        int smax = -1;
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                smax = max;
                max = nums[i];
            }else if(smax<nums[i]){
                smax = nums[i];
            }
        }
        int ans = (max -1) * (smax -1);
        return ans;
    }
}