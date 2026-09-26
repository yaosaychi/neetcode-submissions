class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // behaves as a freq map.
        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency map to keep count of number appearances.
        for (int s : nums) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // we're comparing the keys based on the count in the map.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(map.get(a), map.get(b)));

        // inserting the keys into the pq.
        for (int i : map.keySet()) {
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }
            
        }

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll();
        }

        return arr;
    }
}
