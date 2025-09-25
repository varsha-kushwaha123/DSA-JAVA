class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder sum= new StringBuilder();
        while(i>=0 || j >=0 || carry !=0){
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;

            int t = x + y + carry;
            sum.append(t % 2);   // current binary digit
            carry = t / 2;   
            i--;
            j--;
        }
        sum.reverse();
        String result=sum.toString();
        return result;
    }
}