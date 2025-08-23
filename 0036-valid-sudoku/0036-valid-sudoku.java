class Solution {
    public boolean issafe(char [][] board,int row,int col,char ch){
        for(int i=0;i<9;i++){
            if(board[i][col]==ch && row!=i){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[row][i]==ch && col!=i){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==ch &&(row!=i && col!=j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][]board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch!='.'){
                    if(!issafe(board,i,j,ch)){
                        return false;

                    }

                }
                
            }
          
        }
        return true;
    }
}    