class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    int[] arr;


    public List<List<Integer>> combinationSum(int[] nums, int target) {
        arr = nums;
        backtrack(new ArrayList<Integer>(), target, 0);
        return result;
    }

    public void backtrack(List<Integer> cur, int target, int index){
        if(target == 0){
            result.add(new ArrayList<Integer>(cur));
        } 
        
        if(target < 0){
            return;
        }

        for(int i = index; i < arr.length; i++){
            cur.add(arr[i]);
            backtrack(cur, target - arr[i], i);
            cur.remove(cur.size()-1);
        }
    }

}
