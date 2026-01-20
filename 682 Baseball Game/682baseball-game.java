class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String s : operations) {

            if (s.equals("C")) {
                st.pop();

            } else if (s.equals("D")) {
                st.push(2 * st.peek());

            } else if (s.equals("+")) {
                int top1 = st.pop();
                int top2 = st.peek();
                int sum = top1 + top2;
                st.push(top1);
                st.push(sum);

            } else {
                st.push(Integer.parseInt(s));
            }
        }

        int total = 0;
        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }
}
