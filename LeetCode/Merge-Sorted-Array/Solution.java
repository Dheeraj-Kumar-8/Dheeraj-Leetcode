1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        int i=0,j=0;
5        int ans[] = new int[m+n];
6        int ind = 0;
7        while(i<m && j<n)
8        {
9            if(nums1[i] != nums2[j])
10            {
11                if(nums1[i] < nums2[j])
12                {
13                    ans[ind] = nums1[i];
14                    ind++;
15                    i++;
16                }
17                else
18                {
19                    ans[ind] = nums2[j];
20                    ind++;
21                    j++;
22                }
23            }
24            else
25            {
26                ans[ind] = nums1[i];
27                ind++;
28                ans[ind] = nums2[j];
29                ind++;
30                i++;
31                j++;
32            }
33        }
34        while(i < m)
35        {
36            ans[ind] = nums1[i];
37            ind++;
38            i++;
39        }
40
41        while(j < n)
42        {
43            ans[ind] = nums2[j];
44            ind++;
45            j++;
46        }
47
48        for(int k = 0; k < m + n; k++)
49        {
50            nums1[k] = ans[k];
51        }
52
53        
54    }
55}