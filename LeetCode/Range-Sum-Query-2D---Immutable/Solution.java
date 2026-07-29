1class NumMatrix {
2    int pre[][];
3    public NumMatrix(int[][] matrix) {
4
5        int r = matrix.length;
6        int c = matrix[0].length;
7        pre = new int[r][c];
8        for(int i=0;i<r;i++)
9        {
10            pre[i][0] = matrix[i][0];
11            for(int j=1;j<c;j++)
12            {
13                pre[i][j] = pre[i][j-1]+matrix[i][j];
14            }
15        }
16        for(int i=1;i<r;i++)
17        {
18            for(int j=0;j<c;j++)
19            {
20                pre[i][j] = pre[i-1][j]+pre[i][j];
21            }
22        }
23           
24    }
25    
26    public int sumRegion(int row1, int col1, int row2, int col2) {
27
28        int ans = pre[row2][col2];
29
30        if(row1>0)
31        {
32            ans -= pre[row1-1][col2];
33        }
34        if(col1>0)
35        {
36            ans-= pre[row2][col1-1];
37        }
38        if(row1>0 && col1>0)
39        {
40            ans+=pre[row1-1][col1-1];
41        }
42        return ans;
43    }
44}
45
46/**
47 * Your NumMatrix object will be instantiated and called as such:
48 * NumMatrix obj = new NumMatrix(matrix);
49 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
50 */