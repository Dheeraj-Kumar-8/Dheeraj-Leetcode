1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices[0];
4        int sell = 0;
5        for(int i=1;i<prices.length;i++)
6        {
7            
8            if(prices[i] < buy)
9            {
10                buy = prices[i];
11            }
12            if(prices[i] - buy > sell) 
13            {
14                sell = prices[i] - buy;
15            }
16            
17        }
18        return sell;
19        
20    }
21}