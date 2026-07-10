1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> idx = new ArrayList<>();
4
5        Arrays.sort(nums);
6        for(int i=0;i<nums.length;i++)
7        {
8            if(nums[i] == target)
9            {
10                idx.add(i);
11            }
12        }
13        return idx;
14    }
15}