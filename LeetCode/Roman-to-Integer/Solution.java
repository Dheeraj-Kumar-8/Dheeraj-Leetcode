1class Solution {
2    public int romanToInt(String s) {
3        int total = 0;
4        int n = s.length();
5
6        for(int i=0;i<n;i++)
7        {
8            int curval = getValue(s.charAt(i));
9            if(i<n-1 && curval < getValue(s.charAt(i+1)))
10            {
11                total -= curval;
12            }
13            else
14            {
15                total += curval;
16            }
17        }
18        return total;
19    }
20    int getValue(char c)
21    {
22        switch(c)
23        {
24            case 'I': return 1;
25            case 'V': return 5;
26            case 'X': return 10;
27            case 'L': return 50;
28            case 'C': return 100;
29            case 'D': return 500;
30            case 'M': return 1000;
31            default:  return 0;
32
33
34        }
35    }
36}