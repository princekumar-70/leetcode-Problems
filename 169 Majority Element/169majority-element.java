class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > arr.length / 2) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return arr[0]; 
    }
}
