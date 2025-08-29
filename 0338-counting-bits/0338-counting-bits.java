class Solution {
    public int[] countBits(int n) {
        int count=0;
        
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            count=0;
            int num=i;
            while(num!=0){
                if((1&num)==1){
                    count++;
                }
                num=num>>1;
            }
            arr[i]=count;
        }
        return arr;
    }
}