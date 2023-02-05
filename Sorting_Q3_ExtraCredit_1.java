// 2164. Sort Even and Odd Indices Independently
// https://leetcode.com/problems/sort-even-and-odd-indices-independently/description/

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=0; i < nums.length; i+=2) {
            int min = nums[i];
            int index = i;
            int temp = 0;
            for(int j=i; j < nums.length; j+=2) {
                if (nums[j] < min){
                    min = nums[j];
                    index = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        for(int i=1; i < nums.length; i+=2) {
            int max = nums[i];
            int index = i;
            int temp = 0;
            for(int j=i; j < nums.length; j+=2) {
                if (nums[j] > max){
                    max = nums[j];
                    index = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }
}
