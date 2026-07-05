class Solution {
    public String longestCommonPrefix(String[] arr) {
        String s = "";
       StringBuilder sb = new StringBuilder();
       
       for (int i = 0; i < arr[0].length(); i++) {
          char ch = arr[0].charAt(i);
            sb.append(ch);
        }
       for(int i =1;i<arr.length;i++){
           int right = 0;
           while(right<sb.length()&& right<arr[i].length()){
             if(arr[i].charAt(right)!=sb.charAt(right)){
                break;
             }
             right++;
           }
           sb.delete(right , sb.length());
           if(sb.length()==0) return s;
       }

       
     return sb.toString();
    }
}