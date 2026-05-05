class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> counts.get(n1) - counts.get(n2));

        for (int n : counts.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = heap.poll();
        }
        
        return topK;
    }
}
