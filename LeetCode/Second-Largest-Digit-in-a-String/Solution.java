1class Solution {
2    public int secondHighest(String s) {
3        int first = -1;
4        int second = -1;
5        for(char c : s.toCharArray())
6        {
7            if(Character.isDigit(c))
8            {
9                int num = c-'0';
10                if(num > first)
11                {
12                    second = first;
13                    first = num;
14                }
15                else if(num>second && num!=first)
16                {
17                    second = num;
18                }
19            }
20        }
21        return second;  
22    }
23}