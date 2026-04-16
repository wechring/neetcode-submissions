class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);;
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] al = new int[k];

        for(int n: nums){
            h.put(n, h.getOrDefault(n,0) + 1);
        }

        for(int a: h.keySet()){
            pq.add(new int[] {h.get(a),a});
        }

        for(int j = 0; j < k; j++){
            al[j] = (pq.poll()[1]);
        }

        return al;

    }
}
