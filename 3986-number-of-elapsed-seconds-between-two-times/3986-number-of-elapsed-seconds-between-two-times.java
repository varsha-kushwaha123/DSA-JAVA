class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return toseconds(endTime)-toseconds(startTime);
        
    }
    private int toseconds(String time){
        String []parts=time.split(":");
        int hours=Integer.parseInt(parts[0]);
        int min=Integer.parseInt(parts[1]);
        int sec=Integer.parseInt(parts[2]);

        return 3600*hours+min*60+sec;
    }
}