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
    public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode leftEnd = null;
    ListNode start = null;
     
    boolean check = false;

    ListNode curr = head;
    ListNode prev = null;
    ListNode next = null;

    int count = 1;

while(count<=right){

    if(count>=left){
        if(!check){
            start = curr;
            check = true;
        }
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

      count++;
    }else{
        leftEnd = curr;
        curr = curr.next;
        count++;
    }
}

    start.next = next;
    if(leftEnd!=null){
      leftEnd.next = prev;
    }

if(left<=1){
    head = prev;
}
return head;
        
    }
}