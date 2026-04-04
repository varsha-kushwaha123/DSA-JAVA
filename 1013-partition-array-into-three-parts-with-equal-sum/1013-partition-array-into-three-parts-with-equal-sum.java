class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        else{
            int x=sum/3;
            int currsum=0;
            for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                if(currsum==x){
                    count++;
                    currsum=0;
                }
            }
        }
        
        return count>=3;
    


        
    }
}