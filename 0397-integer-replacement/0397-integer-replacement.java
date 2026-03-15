class Solution {
    public int integerReplacement(int n) {
        int steps=0;
        long nt=n;
        while(nt!=1){
            if(nt%2==0){
                nt=nt/2;
                steps++;
            }
            else{
                if(nt==3 || (nt&2)==0){
                    nt--;
                    steps++;
                }
                else{
                    nt++;
                    steps++;

                }
                
            }
        }
        return steps;
    }
}