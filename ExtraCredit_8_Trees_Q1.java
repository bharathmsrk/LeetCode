// LeetCode Easy
// 700. Search in a Binary Search Tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;
        while(curr != null){
            if(val == curr.val){
                return curr;
            }
            if(curr.val < val){
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return null;
    }
}
