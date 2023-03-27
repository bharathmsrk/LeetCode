// LeetCode Easy
// 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
// https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/description/

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode l;
        if(original == null || original == target){
            return cloned;
        }
        l = getTargetCopy(original.left, cloned.left, target);
        if(l != null){
            return l;
        }
        return getTargetCopy(original.right, cloned.right, target); 
    }
}
