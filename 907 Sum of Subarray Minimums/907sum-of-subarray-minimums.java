class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        long mod = 1000000007;
        long result = 0;

 
        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

 
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

     
        for(int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            result = (result + (long)arr[i] * left * right) % mod;
        }

        return (int)result;
    }
}