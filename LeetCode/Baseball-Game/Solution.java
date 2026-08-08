1class Solution {
2    public int calPoints(String[] operations) {
3
4        Stack<Integer> stk = new Stack<>();
5        for(String c : operations)
6        {
7            if(Character.isDigit(c.charAt(0)) || c.charAt(0) == '-')
8            {
9                stk.push(Integer.parseInt(c));
10            }
11            if(c.equals("+"))
12            {
13                if(stk.size() >= 2)
14                {
15                    int val1 = stk.pop();
16                    int val2 = stk.peek();
17                    stk.push(val1);
18                    stk.push(val1 + val2);
19                }
20            }
21            if(c.equals("C"))
22            {
23                if(!stk.isEmpty())
24                {
25                    stk.pop();
26                }
27            }
28            if(c.equals("D"))
29            {
30                if(!stk.isEmpty())
31                {
32                    int num = stk.peek() * 2;
33                    stk.push(num);
34                }
35            }
36        }
37        int sum = 0;
38        while(!stk.isEmpty())
39        {
40            sum += stk.pop();
41        }
42        return sum;
43    }
44}