1class Solution {
2    public int firstMatchingIndex(String s) {
3        int i = 0;
4        int j = s.length()-1;
5
6        while(i<=j)
7        {
8            if(s.charAt(i) == s.charAt(j))
9            {
10                return i;
11            }
12            else
13            {
14                i++;
15                j--;
16            }
17        }
18        return -1;
19        
20    }
21}