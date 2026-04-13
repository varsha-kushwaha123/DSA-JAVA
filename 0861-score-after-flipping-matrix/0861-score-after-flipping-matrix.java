class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int num;
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 0){
                for(int j = 0; j < m; j++){
                    grid[i][j] ^= 1;
                }
            }
        }

        for(int i = 0; i < m; i++){
            int countZero = 0;

            for(int j = 0; j < n; j++){
                if(grid[j][i] == 0){
                    countZero++;
                }
            }

            if(countZero > n / 2){
                for(int j = 0; j < n; j++){
                    grid[j][i] ^= 1;
                }
            }
        }

        int total=0;
    

        for (int i = 0; i < n; i++) {
             num = 0;

            for (int j = 0; j < m; j++) {
                num = num * 2 + grid[i][j];
            }
            total+=num;
        }
       return total; 

    }
}