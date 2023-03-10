// LeetCode Medium
// 2390. Removing Stars From a String
// https://leetcode.com/problems/removing-stars-from-a-string/description/

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i =0; i < s.length(); i++){
           if(s.charAt(i)=='*'){
               stack.pop();
           } else {
               stack.push(s.charAt(i));
           }
        } 
        while(!stack.isEmpty()){
            char a = stack.pop();
            result.append(a);
        }  
        result.reverse();
        return result.toString();
    }
}
