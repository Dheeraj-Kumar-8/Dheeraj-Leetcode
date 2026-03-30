1class Solution {
2    public int findDuplicate(int[] nums) {
3        int max = Arrays.stream(nums).max().getAsInt();
4        int freq [] = new int[max+1];
5        for(int n : nums)
6        {
7            freq[n]++;
8        }
9        for(int i=0;i<nums.length;i++)
10        {
11            if(freq[i] >1)
12            {
13                return i;
14            }
15        }
16        return -1;
17        
18    }
19}