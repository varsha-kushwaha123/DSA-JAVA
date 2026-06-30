class Solution {
    public int convertTime(String current, String correct) {
        int steps=0;
        int hr1=Integer.parseInt(current.substring(0,2));
        int min1=Integer.parseInt(current.substring(3));
        int totalmin1=(hr1*60)+min1;
        int hr2=Integer.parseInt(correct.substring(0,2));
        int min2=Integer.parseInt(correct.substring(3));
        int totalmin2=(hr2*60)+min2;
       int rem=totalmin2-totalmin1;
       while(rem>0){
        if(rem>=60){
            steps+=rem/60;
            rem=rem%60;

        }
        if(rem>=15 && rem<60){
            steps+=rem/15;
            rem=rem%15;
        }
        if(rem>=5 && rem<15){
            steps+=rem/5;
            rem=rem%5;
        }
        if(rem>=1 && rem<5){
            steps+=rem/1;
            rem=rem%1;
        }


       }
       return steps;
        
    }
}