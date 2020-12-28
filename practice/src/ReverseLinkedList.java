public class ReverseLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode ans = new ListNode();
        while(head !=null)
        {
            if(ans==null)
            {
                ans.val=head.val;
                System.out.println(ans.val);
            }
            else
            {
                ListNode temp = new ListNode();
                temp.val = head.val;
                temp.next=ans;
                System.out.println(ans.val);
                ans=temp;
            }
            head = head.next;

        }
        return ans;
    }
    //1->2   5->4->3->2->1->null
    public ListNode reverseListRec(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode curr = reverseListRec(head.next);
        head.next.next = head;
        head.next=null;
        return curr;
    }
}
