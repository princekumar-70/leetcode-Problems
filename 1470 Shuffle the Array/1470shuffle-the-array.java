class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left =0;
       int[] result = new int[2*n];
       
        
        for(int i=0; i<n;i++){
             result[left++] = nums[i];       
            result[left++] = nums[i + n];   
        }
        
       
        return result;
        
    }
}