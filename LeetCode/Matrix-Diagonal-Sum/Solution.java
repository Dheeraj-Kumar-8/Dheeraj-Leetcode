1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int r = mat.length;
4        int c = mat[0].length;
5        int sum = 0;
6        for(int i=0;i<r;i++)
7        {
8            for(int j=0;j<c;j++)
9            {
10                int val = 0;
11                if(i==j  || i+j==r-1)
12                {
13                    if(val!= mat[i][j])
14                    {
15                    sum+=mat[i][j];
16                    }
17                    val = mat[i][j];
18                }
19            }
20        }
21        return sum;
22    }
23}