1class MyHashMap {
2
3   int A[];
4
5    public MyHashMap() 
6    {
7       A =  new int[(int)1e6+1];
8       Arrays.fill(A,-1);
9    }
10    
11    public void put(int key, int value) 
12    {
13        A[key] = value;
14    }
15    
16    public int get(int key) 
17    {
18        return A[key];
19    }
20    
21    public void remove(int key)
22    {
23        A[key] = -1;
24    }
25}