class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int [][]arr=new int[n][2];
        for(int i=0;i<n;i++){
           arr[i][0]=nums[i];
           arr[i][1]=i;
          
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int j;
        for(j=0;j<n-1;j++){
            if(arr[j][0]==arr[j+1][0]){
                if(Math.abs(arr[j][1]-arr[j+1][1])<=k){
                    return true;
                }
            }
        }
        return false;
        

        
    }
}