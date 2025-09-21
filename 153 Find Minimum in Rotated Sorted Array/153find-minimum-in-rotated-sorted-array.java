class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
		int start =0 , end = nums.length-1;
		int ans = -1;
		while(start<=end) {
			int mid = start +(end-start)/2;
			if(nums[mid]<=nums[n-1]) {
				ans = mid;
				end = mid-1;
				
			}else {
				start = mid +1;
			}
		}
		return nums[ans] ;
    }
}