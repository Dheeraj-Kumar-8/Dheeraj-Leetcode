1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int n : nums)
5        {
6            map.put(n,map.getOrDefault(n,0)+1);
7        }
8                for(int k : map.keySet())
9                {
10                    if(map.get(k)!=1)
11                    {
12                        return k;
13                    }
14                }
15            
16        return -1;
17        
18    }
19}