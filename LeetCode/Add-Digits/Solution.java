1class Solution {
2    public int addDigits(int num) {
3        if(num>=0 && num<=9)
4        {
5            return num;
6        }
7        return 1+(num-1)%9;
8       
9        
10    }
11}