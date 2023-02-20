// 1356. Sort Integers by The Number of 1 Bits
// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/

class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int min = Integer.bitCount(arr[i]);
            int index = i;
            int temp = 0;
            for (int j=i; j < arr.length; j++){
                if (Integer.bitCount(arr[j]) < min){
                    min = Integer.bitCount(arr[j]);
                    index = j;
                }
                else if (Integer.bitCount(arr[j]) == min){
                    if(arr[j]<arr[index]) {
                        min = Integer.bitCount(arr[j]);
                        index = j;
                    }
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
