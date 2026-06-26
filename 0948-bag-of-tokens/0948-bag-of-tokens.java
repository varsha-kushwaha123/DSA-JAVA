class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int i=0;
        int j=tokens.length-1;
        int maxscore=0;
        
        if(tokens.length==0 || tokens[0]>power) return 0;
        while(i<=j){
            if(tokens[i]<=power){
                score++;
                maxscore=Math.max(maxscore,score);
                power=power-tokens[i];
                i++;
            }
            else if(score>0){
                power=power+tokens[j];
                score--;
                j--;
            }
            else{
                break;
            }
        }
        return maxscore;

    }
}