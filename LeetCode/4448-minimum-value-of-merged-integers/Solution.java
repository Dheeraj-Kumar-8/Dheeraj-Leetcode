class Solution {
    public int minMergedInteger(int[] nums) {
        
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2)
        {
            int n = Integer.parseInt(nums[i]+""+nums[i+1]);
            mini = Math.min(mini,n);
        }
        return mini;
    }
}