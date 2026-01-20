class Solution {
    public boolean isValid(String Str) {
        Stack<Character> st = new Stack<>();
		int n = Str.length();
		for(int i =0;i<n;i++) {
			char ch = Str.charAt(i);
			if(ch =='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}else {
				if(st.size()==0) {
					return false;
				}
                char top = st.peek();
				if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
                st.pop();
			}
		}
		return st.size()==0;
    }
}