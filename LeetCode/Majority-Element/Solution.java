1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4        int ans= 0;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i : nums)
7        {
8            map.put(i, map.getOrDefault(i,0)+1);
9        }
10        for(int el : map.keySet())
11        {
12            if(map.get(el) > n/2 )
13            {
14                ans = el;
15            }
16        }
17        return ans;
18    }
19}