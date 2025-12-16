class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j =i+1;j<nums.length; j++){
                if(nums[i] == nums[j]){
                    nums[i] = Integer.MIN_VALUE;
                    nums[j] = Integer.MIN_VALUE;
                }
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=Integer.MIN_VALUE){
               return nums[i];
            }
        }
        return -1;

    }
}