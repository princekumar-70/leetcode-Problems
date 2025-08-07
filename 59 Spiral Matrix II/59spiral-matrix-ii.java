class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        
        int count= 1;
        int toprow =0,bottomrow= n-1,leftcol=0,rightcol=n-1;
        while(count<=n*n){
            
               for(int i = leftcol;i<=rightcol;i++){
                 arr[toprow][i]=count;
                 count++;
                 
               } 
               toprow++;

            
             
               for(int i = toprow;i<=bottomrow;i++){
                 arr[i][rightcol]=count;
                 count++;
                 
               } 
               rightcol--;

            
             
               for(int i = rightcol;i>=leftcol;i--){
                 arr[bottomrow][i]=count;
                 count++;
                 
                } 
               bottomrow--;

            
             
               for(int i = bottomrow;i>=toprow;i--){
                 arr[i][leftcol]=count;
                 count++;
                 
               } 
               leftcol++;

            
        }
        return arr;
    }
    
}