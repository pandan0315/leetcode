/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            } else {
                map.put(nums[i],i);
            }
        }
        
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end

