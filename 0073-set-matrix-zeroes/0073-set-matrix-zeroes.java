class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashMap<Integer,Boolean>rowmap=new HashMap<>();
        HashMap<Integer,Boolean>colmap=new HashMap<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowmap.put(i,true);
                    colmap.put(j,true);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowmap.containsKey(i) || colmap.containsKey(j)){
                    matrix[i][j]=0;

                }
                
            }
        }
        
           
    }
}