class Solution {
    public ListNode reverseList(ListNode head) {
       if(head == null) return null;
        
        ListNode cur = head, pre = null;
        
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}