/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int len = 0;
         while (temp != null) {
             map.put(len, temp);
             temp = temp.next;
             len++;
        }

        return map.get(len / 2);
    }  
}