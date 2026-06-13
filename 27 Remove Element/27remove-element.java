
class Solution {
    public int removeElement(int[] nums, int val) {
       int k =0;
       int left =0;
       int right = nums.length-1;
       
       while(left<=right ){
        if(nums[left]!=val){
            nums[k++] = nums[left];
          
        }
          left++;

       }
       return k;
    }
}
