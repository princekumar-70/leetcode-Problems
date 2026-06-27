class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String max = "";
    
    
        
    
       
        for(String word : dictionary){
               int p1 = 0;
          int p2 = 0;
          while(p1<s.length() && p2<word.length()){
            if(s.charAt(p1) == word.charAt(p2)){
                p2++;
            
             }
             p1++;
          }
          if(p2==word.length()){
            if(word.length()>max.length()){
                max = word;
            } else if (word.length() == max.length()
                        && word.compareTo(max) < 0) {
                    max = word;
                }
          }

        }
        return max;


    }
}