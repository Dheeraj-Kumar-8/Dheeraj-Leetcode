1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int sol[] = new int[nums.length];
5        int pre[] = new int[nums.length];
6        pre[0] = 1;
7        for(int i=1;i<nums.length;i++)
8        {
9            pre[i] = nums[i-1] * pre[i-1];
10        }
11        int suf[] = new int[nums.length];
12        suf[nums.length-1] = 1;
13        for(int i=nums.length-2;i>=0;i--)
14        {
15            suf[i] = nums[i+1] * suf[i+1];
16        }
17
18        for(int i=0;i<nums.length;i++)
19        {
20            sol[i] = pre[i] * suf[i];
21        }
22        return sol;
23    }
24}