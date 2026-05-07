class Solution {
    public int minTimeToType(String word) {
        int time=0;
        int travel;
        if(word.charAt(0)=='a'){
            time+=1;
        }
        else{
            int cw=Math.abs( 'a'-word.charAt(0));
            int acw= 26-cw;
             travel=Math.min(cw,acw);
            time+=travel+1;

        }
        for(int i=1;i<word.length();i++){
            travel=0;
            int cw=Math.abs( word.charAt(i)-word.charAt(i-1));
            int acw= 26-cw;
            travel=Math.min(cw,acw);
            time+=travel+1;
        }
        return time;
    }
}