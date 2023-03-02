// LeetCode Easy
// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        ListNode current1 = list1;
        ListNode current2 = list2;
        while(current1 != null || current2 != null){
          if(current1 == null){
            tail.next = new ListNode(current2.val);
                    tail = tail.next;
            current2 = current2.next;
          }
          else if (current2 == null){
            tail.next = new ListNode(current1.val);
                    tail = tail.next;
            current1 = current1.next;
          }
          else if(current1.val <= current2.val){
            tail.next = new ListNode(current1.val);
                    tail = tail.next;
            current1 = current1.next;
          } else {
            tail.next = new ListNode(current2.val);
                    tail = tail.next;
            current2 = current2.next;
          }
        }
		    return head.next;
    }
}

