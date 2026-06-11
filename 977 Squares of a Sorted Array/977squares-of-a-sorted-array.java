class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                n++;
            }
        }
        
        int k =0;
       int left[] = new int[n];
       int right[] = new int[arr.length-n];
      int p = n-1;

for(int i=0;i<arr.length;i++){
    if(arr[i]<0){
        left[p--]=arr[i];
    }else{
        right[k++]=arr[i];
    }
}
       for(int i= 0; i<left.length;i++){
            left[i]*=left[i];
       }
       for(int i= 0; i<right.length;i++){
            right[i]*=right[i];
       }
       int i =0, j = 0;
       int l =0;
       while(i<left.length && j<right.length){
          if(left[i]<right[j]){
            arr[l++] = left[i];
            i++;
          }else{
            arr[l++] = right[j];
            j++;
          }
       }
       while(i<left.length){
        arr[l++] = left[i];
        i++;
       }while(j<right.length){
        arr[l++] = right[j];
        j++;
       }
       return arr;
    }
}