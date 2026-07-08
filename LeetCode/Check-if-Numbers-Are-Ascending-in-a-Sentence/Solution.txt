1class Solution {
2    public boolean areNumbersAscending(String s) {
3
4        boolean result = true;
5        int previous = 0;
6        for(int i=0; i < s.length(); i++)
7        {
8            if(Character.isDigit(s.charAt(i)))
9            {
10                int current = 0;
11                while (i < s.length() && Character.isDigit(s.charAt(i))) 
12                {
13                    current = current * 10 + (s.charAt(i) - '0');
14                    i++;
15                }
16                if(previous < current)
17                {
18                    previous = current;
19                    continue;
20                }
21                else
22                {
23                    result = false;
24                    break;
25                }
26            }
27        }
28        return result;
29    }
30}