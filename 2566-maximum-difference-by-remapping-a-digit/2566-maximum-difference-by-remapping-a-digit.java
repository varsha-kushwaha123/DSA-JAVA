class Solution {
    public int minMaxDifference(int num) {
       String s1=String.valueOf(num);
      String maxstr=s1;
      for(char c:s1.toCharArray()){
        if(c !='9'){
            maxstr=s1.replace(c,'9');
            break;
        }
      }
      String minstr=s1.replace(s1.charAt(0),'0');
      return Integer.parseInt(maxstr)-Integer.parseInt(minstr);


        
    }
}