1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18
19        Node curr = head;
20        Map<Node,Node> map = new HashMap<>();
21        while(curr!=null)
22        {
23            Node copy = new Node(curr.val);
24            map.put(curr,copy);
25            curr = curr.next;
26        }
27
28        curr = head; // for new down loop down to create the copy links
29        while(curr!=null)
30        {
31            map.get(curr).next = map.get(curr.next);
32            map.get(curr).random = map.get(curr.random);
33            curr = curr.next;
34        }
35
36        return map.get(head);
37        
38    }
39}