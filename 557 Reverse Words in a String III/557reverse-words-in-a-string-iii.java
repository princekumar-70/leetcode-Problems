class Solution {
    public String reverseWords(String s) {
        String Ans = "";
		StringBuilder sb = new StringBuilder("");
		for(int i =0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch!=' ') {
				sb.append(ch);
				
			}
			else {
				sb.reverse();
				Ans +=sb;
				Ans+=" ";
				sb.delete(0, sb.length());
			}
		}
		sb.append("");
		sb.reverse();
		Ans+=sb;
        return Ans;
    }
}