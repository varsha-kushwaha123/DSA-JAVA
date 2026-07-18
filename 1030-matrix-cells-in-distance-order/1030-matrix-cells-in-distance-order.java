class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) { 
        int [][] arr=new int[rows*cols][2];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[k][0]=i;
                arr[k][1]=j;
                k++;
            }
        }
         Arrays.sort(arr, (a, b) ->
            (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter))
            -
            (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))
        );
        return arr;
        
    }
}