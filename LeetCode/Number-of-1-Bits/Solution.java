1class Solution {
2    public int hammingWeight(int n) {
3        int count = 0;
4        for(int i=0;i<32;i++)
5        {
6            if((n&(1<<i))>0)
7            {
8                count++;
9            }
10        }
11        return count;
12    }
13}