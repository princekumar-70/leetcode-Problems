class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int left =0;
        int right = k-1;
        int sum =0;
        double average ;
      
        for(int i = left; i<=right; i++){
            sum = sum+arr[i];

        }
          double max = (double) sum/k;;
        while(right<arr.length){
            average =(double) sum/k;
            max = Math.max(max , average);
            left++;
            right++;

            sum = sum - arr[left-1];
            if(right  == arr.length){
                break;
            }
            sum = sum + arr[right];
        }
        return max;
    }
}