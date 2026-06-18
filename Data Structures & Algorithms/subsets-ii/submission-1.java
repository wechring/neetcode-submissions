class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    int[] arr;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        arr = nums;
        Arrays.sort(arr);
        backtrack(new ArrayList<Integer>(), 0);
        return result;
    }

    public void backtrack(List<Integer> cur, int index){

        result.add(new ArrayList<Integer>(cur));
        
        for(int i = index; i < arr.length; i++){
            if(i > index  && arr[i] == arr[i-1]){
                continue;
            }
            cur.add(arr[i]);
            backtrack(cur, i + 1);
            cur.remove(cur.size()-1);
        }
    }
}
