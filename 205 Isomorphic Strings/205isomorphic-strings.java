class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] arr = new int[256];
        int[] arr2 = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            char sh = t.charAt(i);

            if (arr[ch] != arr2[sh]) {
                return false;
            }

            arr[ch] = i + 1;
            arr2[sh] = i + 1;
        }

        return true;
    }
}