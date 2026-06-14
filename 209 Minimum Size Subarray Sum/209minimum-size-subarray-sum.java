class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(right<nums.length){
            //yha pehle hiring karna h 
            sum+=nums[right];
            while(sum>=target){
                int length = right-left+1;
                res = Math.min(res, length);
                // ab yha pe mai firing kar rha 
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return res==Integer.MAX_VALUE?0:res;

    }
}

