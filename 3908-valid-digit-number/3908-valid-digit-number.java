class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        int []arr=new int[s.length()];
        Boolean present=false;
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        if(arr[0]==x){
            return false;
        }
        else{
            for(int i=1;i<arr.length;i++){
                if(arr[i]==x){
                    present=true;
                    break;
                }

            }
        }
        return present;
    }
}