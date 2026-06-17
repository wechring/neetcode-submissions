class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    int[] arr;

    public List<List<Integer>> subsets(int[] nums) {
        arr = nums;
        backtrack(new ArrayList<Integer>(), 0);
        return res;
    }


    public void backtrack(List<Integer> current, int index){

        res.add(new ArrayList<Integer>(current));

        for(int i = index; i < arr.length ; i++){
            current.add(arr[i]);
            backtrack(current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
