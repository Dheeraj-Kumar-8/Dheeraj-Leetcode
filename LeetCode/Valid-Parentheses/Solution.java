1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stk = new Stack<>();
4        for(char ch : s.toCharArray())
5        {
6            if(ch == '(' || ch == '[' || ch == '{')
7            stk.push(ch);
8            else
9            {
10                if(stk.isEmpty())
11                {
12                    return false;
13                }
14                    char top = stk.pop();
15                    if((ch == ')' && top!='(') ||
16                        (ch == ']' && top!= '[') ||
17                        (ch == '}' && top!='{'))
18                        return false;
19            }
20            
21        }
22                return stk.isEmpty();
23        
24    }
25}