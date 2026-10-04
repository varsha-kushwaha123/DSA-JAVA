class Solution {
    public int minQueenMoves(int[] source, int[] target) {
         if(source[0]==target[0]){
            if(source[1]==target[1]) return 0;
            else{
                return 1;
            }
         }
         else{
            if (target[1]==source[1]) return 1;
            else if(Math.abs(source[0]-target[0])==Math.abs(target[1]-source[1])) return 1;
            else return 2;
         }
        
    }
}