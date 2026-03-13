1class Solution {
2    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
3
4        int c1 = 0;
5        int c2 = 0;
6
7        int A[] = new int[2];
8
9        for(int i = 0; i < nums1.length; i++)
10        {
11            for(int j = 0; j < nums2.length; j++)
12            {
13                if(nums1[i] == nums2[j])
14                {
15                    c1++;
16                    break;
17                }
18            }
19        }
20
21        for(int i = 0; i < nums2.length; i++)
22        {
23            for(int j = 0; j < nums1.length; j++)
24            {
25                if(nums2[i] == nums1[j])
26                {
27                    c2++;
28                    break;
29                }
30            }
31        }
32
33        A = new int[]{c1, c2};
34
35        return A;
36    }
37}