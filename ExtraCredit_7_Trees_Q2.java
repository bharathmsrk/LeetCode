// LeetCode Easy
// 98. Validate Binary Search Tree
// https://leetcode.com/problems/validate-binary-search-tree/description/

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null); 
    }
    public boolean isValidBST(TreeNode node, TreeNode min, TreeNode max) {
        if (node == null){
            return true;
        } 
        if (min != null && node.val <= min.val){
            return false;
        } 
        if (max != null && node.val >= max.val) {
            return false;
        }
        return isValidBST(node.left, min, node) && isValidBST(node.right, node ,max);
    }
}

