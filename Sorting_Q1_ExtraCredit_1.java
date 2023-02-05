// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            boolean flag = false;
            for (int j = 0; j < m+i; j++){
                if (nums2[i] < nums1[j]){
                    int temp1 = nums1[j];
                    nums1[j] = nums2[i];
                    while (j < m+i){
                        int temp2 = nums1[j+1];
                        nums1[j+1] = temp1;
                        temp1 = temp2;
                        j = j+1;
                    }
                    flag = true;
                }
            }
            if(flag == false)
                nums1[m+i] = nums2[i];
        }   
    }
}
