// 2418. Sort the People
// https://leetcode.com/problems/sort-the-people/description/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++){
            int max = heights[i];
            int index = i;
            int temp = 0;
            String temp1 = "";
            for (int j = i; j < heights.length; j++){
                if(heights[j]>max){
                    max = heights[j];
                    index = j;
                }
            }
            temp = heights[i];
            temp1 = names[i];
            heights[i] = max;
            names[i] = names[index];
            heights[index] = temp;
            names[index] = temp1;
        }
        return names;
    }
}
