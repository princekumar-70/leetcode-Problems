class Solution {
    public long subArrayRanges(int[] arr) {
        long sum =0;
        for(int i = 0 ; i<arr.length;i++){
            long largest = arr[i];
            long smallest = arr[i];
            for(int j = i+1;j<arr.length;j++){
                largest = Math.max(largest, arr[j]);
                smallest = Math.min(smallest,arr[j]);
                sum+=(largest-smallest);
            }
        }
        return sum;
    }
}