class Solution {
    public int reverse(int x) {
        int rem,rev=0;
       int p = Integer.MAX_VALUE/10;
		int q = Integer.MIN_VALUE/10;
        
            
             while (x!=0){
                rem = x%10;
                if(rev >p || rev<q){
                    return 0;
                }

                rev = rev*10+rem;
                x = x/10;
             }  
            
            return rev;
        
        
       
        
    }
}