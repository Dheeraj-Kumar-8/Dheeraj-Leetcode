1class Solution {
2    public int addDigits(int num) {
3        if(num<=9)
4        {
5            return num;
6        }
7        else
8        {
9            int temp = num;
10            int Sum = 0;
11            while(temp>0)
12            {
13                int R = temp%10;
14                Sum += R;
15                temp/=10;
16            }
17            num = Sum;
18        }
19        return addDigits(num);
20        
21    }
22}