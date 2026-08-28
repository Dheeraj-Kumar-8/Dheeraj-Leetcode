1class Solution {
2    public int addDigits(int num) {
3        while (num > 9) {
4            num = num / 10 + num % 10;
5        }
6        return num;
7    }
8}