class Solution {
    public int[] scoreValidator(String[] events) {
        int []scoreb=new int[2];
        int score=0,counter=0;
        for(int i=0;i<events.length;i++){
            if(counter==10){
                break;
            }
         
            if(!events[i].equals("W") && !events[i].equals("WD") && !events[i].equals("NB")){
                int e=Integer.parseInt(events[i]);
                score+=e;

            }
             
            else if(events[i].equals("W")){
                counter+=1;
            }
            else if(counter>10){
                break;
            }
            else if(events[i].equals("WD")){
                score+=1;
            }
            else{
                score+=1;
            }

            
        }
        scoreb[0]=score;
        scoreb[1]=counter;
        return scoreb;
        
    }
}