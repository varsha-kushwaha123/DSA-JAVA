class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>queue1=new LinkedList<>();
        Queue<Integer>queue2=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            queue1.add(students[i]);
            queue2.add(sandwiches[i]);
        }
        int count=0;
        while(!queue1.isEmpty() && count<queue1.size()){
            if(queue1.peek().equals(queue2.peek())){
                queue1.poll();
                queue2.poll();
                count=0;

            }
            else{
                int x=queue1.peek();
                queue1.poll();
                queue1.add(x);
                count++;

            }
        }
        return queue1.size();
        
    }
}