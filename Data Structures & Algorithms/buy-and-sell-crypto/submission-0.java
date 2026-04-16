class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for(int n : prices){
            if(n - min > max){
                max = n - min;
            }
            if(n < min){
                min = n;
            }
        }

        return max;
    }
}
