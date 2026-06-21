class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] arr = new int[k];
        int m=0;

for(int num : nums){
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}

PriorityQueue<Map.Entry<Integer, Integer>> pq =
    new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

pq.addAll(freq.entrySet());

for(int i = 0; i < k; i++){
    arr[i]=pq.poll().getKey();
}
    
    return arr;
    }
}
