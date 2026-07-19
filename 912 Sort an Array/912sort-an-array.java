class Solution {
    public int[] sortArray(int[] arr) {
        int n = arr.length-1;
        MergeSort(arr , 0 , n);
        return arr;
    }
    private void MergeSort(int[] arr , int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        MergeSort(arr , low,mid);
        MergeSort(arr, mid+1, high);
        merge(arr , low , mid, high); 

    }
    private void merge(int[]arr , int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] p1 = new int[n1];
        int[] p2 = new int[n2];
        for(int i =0;i<n1;i++){
            p1[i] = arr[low+i];
        }
        for(int i =0; i<n2;i++){
            p2[i] = arr[mid+1+i];
        }
        int i =0; int j =0 ; int k = low;
        while(i<n1 && j<n2){
            if(p1[i]<p2[j]){
                arr[k++] = p1[i++];
            }else{
                arr[k++] = p2[j++];
            }
        }
        while(i<n1){
            arr[k++] = p1[i++];
        }
        while(j<n2){
            arr[k++] = p2[j++];
        }
    }
}