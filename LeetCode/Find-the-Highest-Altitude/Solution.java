1class Solution {
2    public int largestAltitude(int[] gain) {
3        int pre[] = new int[gain.length+1];
4        pre[0] = 0;
5        int max = 0;
6        for(int i=1;i<=gain.length;i++)
7        {
8            pre[i] = pre[i-1]+gain[i-1];
9            if(pre[i]>max)
10            {
11                max = pre[i];
12            }
13        }
14        return max;
15        
16    }
17}