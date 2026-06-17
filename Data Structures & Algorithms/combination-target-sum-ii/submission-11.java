class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    int[] arr;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        arr = candidates;
        Arrays.sort(arr);
        backtrack(new ArrayList<Integer>(), target, 0);
        return result;
    }

    public void backtrack(List<Integer> cur, int target, int index){


        if(target == 0){
            result.add(new ArrayList<>(cur));
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < arr.length; i++){
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            cur.add(arr[i]);
            backtrack(cur, target - arr[i], i + 1);
            cur.remove(cur.size()-1);

        }
    }
}
