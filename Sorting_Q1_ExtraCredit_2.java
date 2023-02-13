// 2089. Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            int min = nums[i];
            int index = i;
            int temp = 0;
            for (int j = i; j < nums.length; j++){
                if (nums[j] < min){
                    min = nums[j];
                    index = j;
                }
            }
            temp = nums[i];
            nums[i] = min;
            nums[index] = temp;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int k = 0; k < nums.length; k ++){
            if (nums[k] == target){
                list.add(k);
            }
        }
        return list;
    }
}
