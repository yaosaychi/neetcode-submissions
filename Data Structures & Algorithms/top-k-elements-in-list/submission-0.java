class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(map.get(b), map.get(a)));

        for(int i : map.keySet()){
            pq.offer(i);
        }

        int [] arr = new int [k];

        for(int i =0;i<arr.length; i++){
            arr[i] = pq.poll();
        }

        return arr;



    }
}

