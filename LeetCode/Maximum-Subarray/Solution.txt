1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum = 0;
4        int res = Integer.MIN_VALUE;
5        for(int el : nums)
6        {
7            sum+=el;
8            if(sum>res)
9            {
10                res = sum;
11            }
12            if(sum<0)
13            {
14                sum = 0;
15            }
16        }
17        return res;
18        
19    }
20}