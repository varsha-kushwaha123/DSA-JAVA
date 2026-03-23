class Solution {
    public int maximumSwap(int num) {

        String s=String.valueOf(num);
        int nums[]=new int[s.length()];
        for(int x=0;x<s.length();x++){
            nums[x]=s.charAt(x)-'0';
        }
        int i;
        for(i=0;i<nums.length-1;i++){
            boolean found=false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    found=true;
                    break;
                }
            }
            if(found){
                break;
            }
        } 
        if(i==nums.length-1) return num;
        
        int maxid=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>=nums[maxid]){
                maxid=j;
                
            }

        }
        for(int k=0;k<=i;k++){
            if(nums[k]<nums[maxid]){
                    int temp=nums[k];
                    nums[k]=nums[maxid];
                    nums[maxid]=temp;
                    break;
                    

            }
        }
        
        int ans=0;

       for(int h=0;h<nums.length;h++){
           ans=ans*10+nums[ h];

       }
       return ans; 


    }
}