1class Solution {
2    public String removeDuplicates(String s) {
3
4        Stack<Character> stk = new Stack<>();   
5        String res = "";
6
7        for(char c : s.toCharArray())
8        {
9            char ch = c;
10
11            if(stk.isEmpty())
12            {
13                stk.push(ch);                   
14            }
15            else                                
16            {
17                if(stk.peek() == ch)
18                {
19                    stk.pop();
20                }
21                else
22                {
23                    stk.push(ch);
24                }
25            }
26        }
27
28        while(!stk.isEmpty())
29        {
30            res += stk.pop();
31        }
32
33        String sol = new StringBuilder(res).reverse().toString();
34
35        return sol;
36    }
37}