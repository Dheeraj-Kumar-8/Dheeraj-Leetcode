1class Solution {
2    public int majorityElement(int[] nums) {
3
4        HashMap<Integer,Integer> map = new HashMap<>();
5        int ans = -1;
6        int n = nums.length;
7        for(int i:nums)
8        {
9            map.put(i,map.getOrDefault(i,0)+1);
10        }
11        for(int k: map.keySet())
12        {
13            if(map.get(k) > n/2)
14            ans = k;
15        }
16    return ans;
17        
18    }
19}