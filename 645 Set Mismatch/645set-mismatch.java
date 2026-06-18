class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
     int dupli = -1;
     int missing = -1;
       Set<Integer> set = new HashSet<>();
     for(int num : nums){
        if(!set.add(num)){
            dupli = num;

        }
        
     }
     for(int i =1 ; i<=n ; i++){
        if(!set.contains(i)){
            missing = i;
        }

     }
       int[] right = new int[2];
       right[0] = dupli;
       right[1] = missing;
        return right ;
    }
}