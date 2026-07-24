class Solution {
    public void solveSudoku(char[][] board) {
        Solve(board);
    }
    public boolean Solve(char[][] arr){
        for(int i =  0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(arr[i][j]=='.'){
                    for(char ch = '1'; ch<='9'; ch++){
                        if(isValid(arr, i, j , ch)){
                            arr[i][j]=ch;
                            if(Solve(arr)==true){
                                return true;
                            }else{
                                arr[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][]arr, int row, int col, char ch){
        for(int i = 0;i<9; i++){
            if(arr[i][col] == ch){
                return false;
            }
            if(arr[row][i]==ch){
                return false;
            }
            if(arr[3*(row/3)+ i/3][3*(col/3)+ i%3]==ch){
                return false;
            }
        }
        return true;
    }
}