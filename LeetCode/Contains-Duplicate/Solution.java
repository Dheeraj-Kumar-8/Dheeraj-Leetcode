1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> HS = new HashSet<>();
4        for(int n : nums)
5        {
6            if(HS.contains(n))
7            {
8                return true;
9            }
10            else
11            {
12                HS.add(n);
13            }
14        }
15        return false;
16    }
17}