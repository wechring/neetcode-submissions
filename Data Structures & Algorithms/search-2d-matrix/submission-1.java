class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;

        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][0] <= target && matrix[i][matrix[0].length - 1] >= target){
                row = i;
            }
        }
        if(row == -1){
            return false;
        }
        int[] b = matrix[row];

        return binarysearch(b, target);

    }

    public boolean binarysearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        int m;

        while(l <= r){
            m = (l + r) /2;

            if( nums[m] == target){
                return true;
            }

            if(nums[m] < target){
                l = m + 1;
            }

            if(nums[m] > target){
                r = m - 1;
            }
        }

        return false;

    }
}
