class Solution {
    public int minimumBuckets(String hamsters) {
        char []arr=hamsters.toCharArray();
        int bucket=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='H'){
              if ((i-1 >= 0 && arr[i-1] == 'B') || (i+1 < n && arr[i+1] == 'B')) continue;
              if(i+1<n && arr[i+1]=='.'){
                arr[i+1]='B';
                bucket++;

              }
              else if(i-1>=0 && arr[i-1]=='.'){
                arr[i-1]='B';
                bucket++;
              }
              else{
                return-1;
              }
            }
        }
        return bucket;
        
    }
}