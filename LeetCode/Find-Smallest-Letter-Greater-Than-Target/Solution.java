1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int l =0;
4        int r = letters.length-1;
5        char ans = letters[0];
6        while(l<=r)
7        {
8            int mid = l+(r-l)/2;
9            
10            if(letters[mid] > target)
11            {
12                ans = letters[mid];
13                r = mid-1;
14            }
15            else
16            {
17                l = mid+1;
18            }
19        }
20        return ans;
21    }
22}