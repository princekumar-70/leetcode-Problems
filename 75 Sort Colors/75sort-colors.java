class Solution {
    public void sortColors(int[] nums) {
      int one =0;
      int two = 0;
      int zero =0;
      for(int i =0;i<nums.length;i++){
        if(nums[i]==0){
            zero++;
        }else if(nums[i]==1){
            one++;
        }else{
            two++;
        }
      }

      int k = 0;
     
        for(int p= 0;p<zero;p++){
            nums[k++] = 0;
        }
        for(int p =0; p<one; p++){
            nums[k++] = 1;
        }
        for(int p =0;p<two;p++){
            nums[k++] = 2;
        }
      
       
    }
}