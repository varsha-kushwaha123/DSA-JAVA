class Solution {
    public int getval(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;

        }
    }
    public int romanToInt(String s) {
        int n=s.length();
        int num=0;
        for(int i=0;i<n-1;i++){
            int ch1=getval(s.charAt(i));
            int ch2=getval(s.charAt(i+1));
            if(ch1<ch2){
                num=num-ch1;
            }
            else{
                num=num+ch1;
            }
        }
        num+=getval(s.charAt(s.length()-1));
        return num;
    }    
}