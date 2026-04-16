class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int[] sorted = nums;
    Arrays.sort(sorted);
    int i = 0;

    while(i < sorted.length - 2 && sorted[i] <= 0 ) {
        int j = i + 1;
        int k = sorted.length - 1;

        while(j < k){
            if(-1 *(sorted[j] + sorted[k]) == sorted[i]){
                res.add(List.of(sorted[i],sorted[j],sorted[k]));
                while(j < k  && sorted[j] == sorted[j+1] ){
                    j++;
                }
                j++;
                while(j < k && sorted[k] == sorted[k-1]) {
                    k--;
                }
                k--;
            } else if (-(sorted[j] + sorted[k]) > sorted[i]) {
                j++;
            } else{
                k--;
            }

        }
        i++;
        
        while(i < sorted.length - 2 && sorted[i] == sorted[i-1]){
            i++;
        }
    }

    return res;
    }
}
