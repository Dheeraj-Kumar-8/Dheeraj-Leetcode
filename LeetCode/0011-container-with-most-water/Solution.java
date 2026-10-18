class Solution {
    public int maxArea(int[] height) {
        int cap = 0;
        int i= 0;
        int j = height.length - 1;
        while(i<j)
        {
            int l = Math.min(height[i],height[j]);
            int b = j - i;
            int area = l*b;
            cap = Math.max(cap, area);
            if(height[i] <= height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return cap;
    }
}