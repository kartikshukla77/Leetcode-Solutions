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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k == 0){
            return head;
        }

    ListNode node = head;
    int size = 0 ;
    ListNode last = null;
    while(node!=null){
        size = size+1;
        last = node;
        node = node.next;
    }
   
    while(k>size){
        k = k-size;
    }
     if(size==1 || size==k){
      return head;
    }
    int el = size-k;
    int i = 1;
    ListNode temp = head;
    while(i<el){
      i++;
      temp = temp.next;
    }
    ListNode start = temp.next;
    temp.next = null;
    last.next = head;
    head = start;

    return head;
        
    }
}