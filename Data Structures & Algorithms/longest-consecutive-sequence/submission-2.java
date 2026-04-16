class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> h = new HashSet<>();
        int cur = 1;
        int most = 1;

        if(nums.length < 2){
            return nums.length;
        }

        for(int n: nums){
            h.add(n);
        }

        for(int n : nums){
            if(h.contains(n - 1)){
                continue;
            } else{
                while(h.contains(n + 1)){
                    cur++;
                    n++;
                }
                if(cur > most){
                    most = cur;
                }
                cur = 1;
            }

        }
        return most;
    }
}
