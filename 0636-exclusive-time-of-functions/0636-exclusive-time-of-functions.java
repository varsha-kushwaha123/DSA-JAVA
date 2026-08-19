class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer>s=new Stack<>();
        int []answer=new int[n];
        int prevtime=0;
        for(String log:logs){
            String[]parts=log.split(":");
            int id=Integer.parseInt(parts[0]);
            String type=parts[1];
            int time=Integer.parseInt(parts[2]);
            if(type.equals("start")){
                if(!s.isEmpty()){
                    answer[s.peek()]+=time-prevtime;

                }
                s.push(id);
                prevtime=time;

            }
            else{
                answer[s.peek()]+=time-prevtime+1;
                s.pop();
                prevtime=time+1;          
            }
        }
        return answer;

        
    }
}