1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int l : nums)
5        {
6            pq.add(l);
7        }
8        int val = 0;
9        while(k>1 && !pq.isEmpty())
10        {
11            pq.remove();
12            k--;
13        }
14        return pq.peek();
15
16        
17    }
18}
19
20
21// 123456 122334556