class Solution {
    public long removeZeros(long n) {

        String s=Long.toString(n);
        String res=s.replace("0","");
        long num = Long.parseLong(res);
        return num;
        
    }
}