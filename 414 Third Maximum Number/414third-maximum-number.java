class Solution {
    public int thirdMax(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
           int[] ans = new int[set.size()];
         
            int index = 0;
            for(int val : set){
                 ans[index++] = val;
            }
            Arrays.sort(ans);
            for(int i = ans.length-1; i>=0;i--){
                if(ans.length >2){
                    return ans[i-2];
                }else if(ans.length<=2){
                    return ans[i];
                }else{
                    return ans[0];

                }
            }
            return ans[0];



       
        
    }
}