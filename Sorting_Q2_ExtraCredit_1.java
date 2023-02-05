// 977. Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/description/


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] num2 = new int[n];
        for (int i=0; i < nums.length; i++){
            num2[i] = nums[i]*nums[i];
        }
        // Arrays.sort(num2); (Easy Solution)
        for(int i = 0; i < num2.length; i++){
            int min = num2[i];
            int index = i;
            int temp = 0;
            for (int j=i; j < num2.length; j++){
                if (num2[j] < min){
                    min = num2[j];
                    index = j;
                }
            }
            temp = num2[i];
            num2[i] = num2[index];
            num2[index] = temp;
        }
        return num2;
    }
}
