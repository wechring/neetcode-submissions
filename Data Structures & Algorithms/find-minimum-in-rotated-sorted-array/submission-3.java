class Solution {
    public int findMin(int[] nums) {

    int l = 0;
    int r = nums.length - 1;
    int m;

    while(l < r){
        m = (l + r) / 2;

        if(m > 0 && nums[m-1] > nums[m]){
            return nums[m];
        } 
        
        if(nums[r] > nums[m]){
            r = m;
        }
        else{
            l = m + 1;
        }
    }
    
        return nums[l];
    }
}
