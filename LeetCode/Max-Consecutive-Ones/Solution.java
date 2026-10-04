1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3
4        int len = 0;
5        int count = 0;
6        for(int i : nums)
7        {
8            if((i&1) == 1)
9            {
10                count++;
11            }
12            else
13            {
14                count = 0;
15            }
16            len = Math.max(len, count);
17        }
18        return len;
19    }
20}