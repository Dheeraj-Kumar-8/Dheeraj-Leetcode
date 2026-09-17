class RecentCounter {
    
    // Queue to hold active timestamps in chronological order 🕒
    private Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t); // Add the newly arrived ping timestamp to the window
        
        // Evict all stale pings that are older than the t - 3000 threshold 🧼
        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll(); // Remove old timestamp from the front of the FIFO queue
        }
        
        // The remaining elements perfectly match the active sliding window size
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */