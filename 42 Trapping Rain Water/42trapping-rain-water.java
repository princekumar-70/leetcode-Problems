class Solution {
    public int trap(int[] arr) {
        int total  = 0;
        int left = 0;
        int right = arr.length-1;
        int leftMax = 0;
        int RightMax = 0;
        while(left<right){
            if(arr[left]<=arr[right]){
                if(leftMax>arr[left]){
                    total+=leftMax - arr[left];
                }else{
                    leftMax = arr[left];
                }
                left++;
            }else{
                if(RightMax>arr[right]){
                    total+=RightMax-arr[right];
                }else{
                    RightMax = arr[right];
                }
                right--;
            }
        }
        return total;

    }
}