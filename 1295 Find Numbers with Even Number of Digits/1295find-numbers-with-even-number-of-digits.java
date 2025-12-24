class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
       
        int left = 0;
        for(int i =0;i<nums.length;i++){
            
		     while(nums[i]!=0) {
                int temp = nums[i];
			    temp=temp/10;
                nums[i] = temp;
			    count=count+1;
			
		    }
           
            if(count %2==0){
                left++;
            }else{
               count =0;
               continue;
            }
        }
        return left;
    }
}