1class Solution {
2    public int tribonacci(int n) {
3
4        int tri[] = new int[38];
5        tri[0] = 0;
6        tri[1] = 1;
7        tri[2] = 1;
8        for(int i=3;i<=n;i++)
9        {
10            tri[i] = tri[i-1]+tri[i-2]+tri[i-3];
11        }
12        return tri[n];
13        
14    }
15}