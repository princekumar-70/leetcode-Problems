class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int start =0, end = n*m-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            int midlt = matrix[mid/m][mid%m];

            if(midlt == target) return true;
            if(target < midlt){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}