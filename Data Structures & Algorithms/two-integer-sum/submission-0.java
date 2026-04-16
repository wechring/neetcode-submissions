class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(h.containsKey(nums[i])){
                return  new int[] {h.get(nums[i]), i};
            } else{
                h.put(target - nums[i], i);
            }
        }

        return  new int[] {};
    }
}
