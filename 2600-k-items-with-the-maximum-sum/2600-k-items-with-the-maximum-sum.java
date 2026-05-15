class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int maxsum=0;
        if(k<=numOnes){
            maxsum=k;
        }
        else{
            maxsum=numOnes;
            k=k-numOnes;
            if(k<=numZeros){
                maxsum=numOnes;
            }
            else{
                k=k-numZeros;
                 maxsum=maxsum-k;;
               
            }
            
        }
        return maxsum;
        
    }
}