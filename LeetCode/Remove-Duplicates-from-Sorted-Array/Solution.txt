1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        LinkedHashMap<Integer, Integer> Hm = new LinkedHashMap<>();
5
6        for(int n : nums)
7        {
8            Hm.put(n,Hm.getOrDefault(n,0)+1);
9        }
10        int  i =0;
11
12        for(int key: Hm.keySet())
13        {
14            nums[i] = key;
15            i++;
16        }
17        return i;
18    }
19}