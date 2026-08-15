1class Solution {
2    public int climbStairs(int n) {
3
4        if(n == 1)
5        return 1;
6        if(n == 2)
7        return 2;
8        int l = 1;
9        int b = 2;
10        for(int i=3;i<=n;i++)
11        {
12            int c = l+b;
13            l = b;
14            b = c;
15        }
16
17        return b;
18        
19    }
20}