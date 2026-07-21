class Solution {
    public int reverseBits(int n) {
        int[] arr = new int[32];
        int left = 0;

        while (left < 32) {
            arr[left++] = n & 1;
            n >>>= 1;
        }

        return Convert(arr);
    }

    private int Convert(int[] arr) {
        int num = 0;

        for (int i = 0; i < 32; i++) {
            num <<= 1;
            num |= arr[i];
        }

        return num;
    }
}