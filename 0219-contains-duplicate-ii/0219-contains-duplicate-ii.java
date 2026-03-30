class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> Set = new HashSet<>();
        for(int i=0; i<nums.length; ++i){
            if(Set.contains(nums[i])) return true;
            Set.add(nums[i]);
            if(Set.size()> k){
                Set.remove (nums[i-k]);
            }
        }
        return false;
    }
}