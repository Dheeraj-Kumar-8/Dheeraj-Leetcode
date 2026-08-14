1class Solution {
2    public int titleToNumber(String columnTitle) {
3
4        int sol = 0;
5        for(char ch : columnTitle.toCharArray())
6        {
7            sol = (sol*26)+(ch - 'A' + 1); 
8        }
9        return sol;
10        
11    }
12}