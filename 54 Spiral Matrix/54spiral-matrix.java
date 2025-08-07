class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>  list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int toprow = 0 , bottomRow = rows-1;
        int leftcol= 0, rightcol = cols-1;

        
        int total = 0;
        while(total<rows*cols){
            if(total<rows*cols){
                for(int i = leftcol;i<=rightcol;i++){
                list.add(matrix[toprow][i]);
                total++;
            }
            toprow++;
            }
            if(total<rows*cols){
                for(int j = toprow;j<=bottomRow;j++){
                list.add(matrix[j][rightcol]);
                total++;
            }
            rightcol--;
            }
            if(total<rows*cols){
                for(int k=rightcol;k>=leftcol;k--){
               list.add(matrix[bottomRow][k]);
                total++;
            }
            bottomRow--;
            }
            if(total<rows*cols){
                for(int l =bottomRow;l>=toprow;l--){
               list.add(matrix[l][leftcol]);
                total++;
            }
            leftcol++;
        }
            }
        return list;
    }
}