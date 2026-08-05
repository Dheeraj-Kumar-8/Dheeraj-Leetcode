1class Solution {
2    public char findTheDifference(String s, String t) {
3
4        HashMap<Character, Integer> map = new HashMap<>();
5
6        for (char c : s.toCharArray()) {
7            map.put(c, map.getOrDefault(c, 0) + 1);
8        }
9
10        for (char c : t.toCharArray()) {
11            if (!map.containsKey(c) || map.get(c) == 0) {
12                return c;
13            }
14            map.put(c,map.get(c)-1);
15        }
16
17        return ' ';
18    }
19}