1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3
4        int n = rowIndex;
5        List<List<Integer>> ans = new ArrayList<>();
6        List<Integer> sol = new ArrayList<>();
7            sol.add(1);  // first list of the list is always 1
8            ans.add(sol);
9        for(int i=1;i<=n;i++)
10        {
11            List<Integer> prev = ans.get(i-1); // access previous list
12
13            List<Integer> curr = new ArrayList<>(); // create current list 
14
15            curr.add(1); // first element of the list is always 1
16
17            for(int j=1;j<=i-1;j++)
18            {
19                curr.add(prev.get(j)+prev.get(j-1));
20            }
21            curr.add(1);  // last element of the list is always 1
22
23            ans.add(curr); // add current list to ans list<lists>
24
25        }
26
27        return ans.get(n);
28        
29    }
30}