1class MinStack {
2    Stack<Integer> stk;
3    Stack<Integer> minstack;
4
5    public MinStack() {
6        stk = new Stack<>();
7        minstack = new Stack<>();    
8    }
9    
10    public void push(int value) {
11        stk.push(value);
12        if(minstack.isEmpty() || value<=minstack.peek())
13        {
14            minstack.push(value);
15        }
16        
17    }
18    
19    public void pop() {
20
21        if(!stk.isEmpty())
22        {
23            int val = stk.pop();
24            if(val == minstack.peek())
25            {
26                minstack.pop();
27            }
28        }
29        
30    }
31    
32    public int top() {
33        return stk.peek();    
34    }
35    
36    public int getMin() {
37        return minstack.peek();
38        
39    }
40}
41
42/**
43 * Your MinStack object will be instantiated and called as such:
44 * MinStack obj = new MinStack();
45 * obj.push(value);
46 * obj.pop();
47 * int param_3 = obj.top();
48 * int param_4 = obj.getMin();
49 */