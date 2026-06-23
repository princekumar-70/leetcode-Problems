class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer , Integer> map  = new HashMap<>();
        int left = 0;
        for(int num : nums){
            int freq = map.getOrDefault(num, 0);
            if(k>freq){
                nums[left++] = num;
                map.put(num , freq+1);
            }

        }
        return Arrays.copyOf(nums,left);
    }
}