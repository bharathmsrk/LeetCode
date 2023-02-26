// LeetCode Hard
// 4. Median of Two Sorted Arrays
// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        float median;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                k++; 
                i++;
            } else {
                nums3[k] = nums2[j];
                k++; 
                j++;
            }
        }
        while(i < nums1.length){
            nums3[k] = nums1[i];
            k++;
            i++;
        }
        while(j < nums2.length){
            nums3[k] = nums2[j];
            k++;
            j++;
        }
        if (nums3.length%2 != 0){
            median = nums3[nums3.length / 2];
        } else {
            int ele1 = nums3.length / 2;
            int ele2 = ele1 - 1;
            median = (float)(nums3[ele1] + nums3[ele2])/2;
        }
        return median;
    }
}
