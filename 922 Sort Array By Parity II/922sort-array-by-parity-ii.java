class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
           
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (j % 2 == 1 && nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }

            
            if (i % 2 == 1 && nums[i] % 2 == 0) {
              
                for (int j = i + 1; j < n; j++) {
                    if (j % 2 == 0 && nums[j] % 2 == 1) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
