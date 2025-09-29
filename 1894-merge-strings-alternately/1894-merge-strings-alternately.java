class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder merge=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        while(i<n1 && j <n2 ){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;

        }
        if(i<n1){
            while(i!=n1){
                merge.append(word1.charAt(i));
                i++;
            }
        }
        if(j<n2){
            while(j!=n2){
            merge.append(word2.charAt(j));
            j++;
            }
        }
        String result=merge.toString();
        return result;
        
        
    }
}