class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
       
       for(int i=0;i<s.length();i++){
        boolean unique = true;
          for(int j =0;j<s.length();j++){
            if( i!=j && arr[i]==arr[j]){
                unique = false;
                break;

            }
          }
          if(unique) return i;
       }
        
        
        return -1;
        
    }
}