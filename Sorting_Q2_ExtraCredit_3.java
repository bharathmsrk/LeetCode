// 1877. Minimize Maximum Pair Sum in Array
// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/

class Solution {
    public int minPairSum(int[] nums) {
        int result = 0;
        int pair =0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length/2; i++){
            pair = nums[i] + nums[nums.length -1 -i];
            result = Math.max(result, pair);
        }
        return result;
    }
}
