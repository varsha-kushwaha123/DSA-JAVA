class Solution {
    public boolean issafe(char [][] board,int row,int col,char ch){
        for(int i=0;i<9;i++){
            if(board[i][col]==ch){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[row][i]==ch){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==ch){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean sudokosolver(char[][]board,int row,int col){
        if(row==9){
            return true;
        }
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9){
             nextrow=row+1;
            nextcol=0;
        }
        if(board[row][col]!='.'){
            return sudokosolver(board,nextrow,nextcol);
        }
        for(char ch='1';ch<='9';ch++){
            if(issafe(board,row,col,ch)){
                board[row][col]=ch;
                if(sudokosolver(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;

    }
    public void solveSudoku(char[][] board) {
        sudokosolver(board,0,0);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}