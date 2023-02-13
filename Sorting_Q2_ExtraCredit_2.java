// 1859. Sorting the Sentence
// https://leetcode.com/problems/sorting-the-sentence/description/

class Solution {
    public String sortSentence(String s) {
        String[] arrs = s.split(" ");
        for(int i = 0; i < arrs.length; i++){
            int min = Integer.parseInt(arrs[i].substring(arrs[i].length() - 1));
            int index = i;
            String temp = "";
            for (int j = i; j < arrs.length; j++){
                int last = Integer.parseInt(arrs[j].substring(arrs[j].length() - 1));
                if (last < min){
                    min = last;
                    index = j;
                }
            }
            temp = arrs[i];
            arrs[i] = arrs[index];
            arrs[index] = temp;
        }
        String ans = String.join(" ", arrs);
        String ans1 = ans.replaceAll("[1-9]", "");
        return ans1;
    }
}
