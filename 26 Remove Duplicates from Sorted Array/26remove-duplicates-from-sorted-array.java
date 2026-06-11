class Solution {
    public int removeDuplicates(int[] arr) {
       
        if(arr.length==0) return 0;
		int i =0;
		int j =i+1;
		int left = 0;
		while(j<arr.length) {
			if(arr[i]==arr[j]) {
				j++;
			}else {
				arr[left++] = arr[i];
				i=j;
				j++;
			}
		
			
		}
		arr[left++] = arr[i];
        return left;
    }
}