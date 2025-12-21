class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
       
      
        int x= nums[0];
        int y = nums[nums.length-1];
        return GCD(x,y);
        
    }
    private int GCD(int x, int y){
        if(y==0)return x;
        return GCD(y,x%y);
    }
}