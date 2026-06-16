class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet h = new HashSet();

        for (int i : nums){
            if(h.contains(i)){
                return true;
            }
            h.add(i);
        }

        return false;
    }
}