class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;
        while(col>=0&&row<matrix.length){
            if(target>matrix[row][col]){
                row++;

            }
            else if(target<matrix[row][col]){
                col--;
            }
            else{
                return true;

            }
        }
        return false;
        
    }
}