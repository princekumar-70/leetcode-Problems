class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int duplicate = 0;
        int left =1;
        int right = left+1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                duplicate = nums[left];
                return duplicate;
            }else{
                left++;
                right++;
            }

        }
        return 1;
    }
}