1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        if(head==null || head.next==null)
14        {
15            return head;
16        }
17        ListNode prev = null,first = head,sec = head.next;
18        while(first!=null && sec!=null)
19        {
20            ListNode third = sec.next;
21            sec.next = first;
22            first.next = third;
23
24            if(prev!=null)
25            {
26                prev.next = sec;
27            }
28            else
29            {
30                head = sec;
31            }
32
33            prev = first;
34            first = third;
35            if(third!=null)
36            {
37                sec = third.next;
38            }
39            else
40            {
41                sec = null;
42            }
43        }
44        return head;
45        
46    }
47}