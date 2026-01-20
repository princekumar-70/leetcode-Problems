class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        long sum =0;
        long maxSum = 0;
        int left = 0;
        for(int right =0;right<nums.length;right++){
           
            while(st.contains(nums[right]) || st.size()==k){
                st.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            st.add(nums[right]);
            if(st.size()==k){
                maxSum = Math.max(maxSum,sum);
            }



        }
        return maxSum;

        
    }
}