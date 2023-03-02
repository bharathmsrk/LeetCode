// LeetCode Easy
// 203. Remove Linked List Elements
// https://leetcode.com/problems/remove-linked-list-elements/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            } else {
                current = current.next;
            } 
        }
        current = head;
        if(current != null && current.val == val){
            head = current.next;
        }
        return head;
    }
}
