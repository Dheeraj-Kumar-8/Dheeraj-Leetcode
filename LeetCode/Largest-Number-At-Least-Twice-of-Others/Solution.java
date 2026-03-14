1class Solution {
2    public int dominantIndex(int[] nums) {
3
4        int n = nums.length;
5        int max = -1;
6        int index = -1;
7        for(int i=0;i<n;i++)
8        {
9            if(nums[i]>max)
10            {
11                max = nums[i];
12                index = i;
13            }
14        }
15        for(int i=0;i<n;i++)
16        {
17            if(nums[i] != max && max < nums[i]*2 )
18            {
19                return -1;
20            }
21        }
22        return index;
23        
24    }
25}