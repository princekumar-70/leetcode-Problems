class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int count =0;
        // for(int i =0;i<n;i++){
        //     if(count == nums[i]){
        //         count++;
        //     }else{
        //         return count;
        //     }
        // }
        // return count;
      

        HashSet<Integer> set = new HashSet<>();
        for(int elem: nums){
            set.add(elem);

        }
        for(int i =0;i<=nums.length;i++){
           if(!set.contains(i) ){
              return i;
           }

        }
        return -1;
      
    }
}