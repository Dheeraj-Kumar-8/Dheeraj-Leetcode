1class Solution {
2    public int[] runningSum(int[] nums) {
3
4        int n = nums.length;
5        for(int i=1;i<n;i++)
6        {
7            nums[i] = nums[i-1]+nums[i];
8        }
9        return nums;
10        
11    }
12}