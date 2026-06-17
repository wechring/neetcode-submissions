class Solution {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    int[] arr;

    public List<List<Integer>> permute(int[] nums) {
        arr = nums;
        backtrack(new ArrayList<Integer>(), new HashSet<>());
        return result;
    }

    public void backtrack(List<Integer> cur, HashSet<Integer> hashcur){
        if(cur.size() == arr.length){
            result.add(new ArrayList<Integer>(cur));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(hashcur.contains(arr[i])){
                continue;
            }
            cur.add(arr[i]);
            hashcur.add(arr[i]);
            backtrack(cur, hashcur);
            cur.remove(cur.size()-1);
            hashcur.remove(arr[i]);
        }
    }
}
