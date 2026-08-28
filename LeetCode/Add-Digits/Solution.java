1class Solution {
2    public int addDigits(int num) {
3        int sum =0;
4        if(num>=0 && num<=9)
5        {
6            return num;
7        }
8        else
9        {
10        while(num>9)
11        {
12            sum = 0;
13            while(num>0)
14            {
15                sum+=num%10;
16                num/=10;
17            }
18            num = sum;
19        }
20        }
21        return num;
22        
23    }
24}