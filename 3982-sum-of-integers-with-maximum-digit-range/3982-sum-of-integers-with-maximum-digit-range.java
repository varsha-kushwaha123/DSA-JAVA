class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int digitrange=0;
            String s=String.valueOf(nums[i]);
            int max=0;
            int min=9;
            for(int j=0;j<s.length();j++){
                int digit = s.charAt(j) - '0';

                    min = Math.min(min, digit);
                    max = Math.max(max, digit);
            }
            digitrange=max-min;
            arr[i]=digitrange;

        }
        int ans=0;
        int m=0;
       
        for(int i=0;i<arr.length;i++){
            m=Math.max(m,arr[i]);

        }
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                ans+=nums[i];
            }
        }
        return ans;

        
    }
}