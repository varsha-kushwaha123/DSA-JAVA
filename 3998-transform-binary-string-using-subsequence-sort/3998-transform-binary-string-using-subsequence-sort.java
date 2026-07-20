class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int count_1=0;
        int n=s.length();
        int []sprefix=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count_1++;
            }
            sprefix[i]=count_1;
        }
        boolean[] ans=new boolean[strs.length];
        for(int j=0;j<strs.length;j++){
            char[] arr=strs[j].toCharArray();
            int fixedones=0;
            int questions=0;
             for(char ch:arr){
                if(ch=='1'){
                    fixedones++;
                }
                else if(ch=='?'){
                    questions++;
                }
            }
            if(count_1 <fixedones || count_1>fixedones + questions){
                ans[j]=false;
                continue;
            }
            int need= count_1-fixedones;
            for(int i=n-1;i>=0 && need>0 ;i--){
                if(strs[j].charAt(i)=='?'){
                    arr[i]='1';
                    need--;
                }
            }
            for(int i=0;i< n ;i++){
                if(arr[i]=='?'){
                    arr[i]='0';
                }
            }
            int prefixones=0;
            boolean possible=true;
             for(int i=0;i<n;i++){
                if(arr[i]=='1'){
                    prefixones++;
                }
                if(prefixones> sprefix[i]){
                    possible=false;
                    break;
                }
             }
             ans[j]=possible;
        }
        return ans;

    }
}