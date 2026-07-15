class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
      int place = 0;
      if(arr[0]==0){
        place = 1;
        arr[0] = 1;
      }
      for(int i =1; i<arr.length;i++){
        if(arr[i]==0 && arr[i-1] == 0){
            place++;
            arr[i] = 1;
        }
        if(arr[i]==1 && arr[i-1]==1) place--;
      }
      return place>=n?true:false;

    }
}