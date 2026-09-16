1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> stk = new Stack<>();
4        for(char c: s.toCharArray())
5        {
6            if(!stk.isEmpty() && stk.peek()==c)
7            {
8                stk.pop();
9            }
10            else
11            {
12                stk.push(c);
13            }
14        }
15        String res = "";
16        while(!stk.isEmpty())
17        {
18            res = stk.pop()+res; //we can use this as we have only 2 non duplicate characters from the string 
19        }
20        return res;
21    }
22}