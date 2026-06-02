class Solution {
    public int minimumSum(int num) {
        String s=Integer.toString(num);
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
       int ans=((arr[0]-'0')*10+(arr[2]-'0'))+((arr[1]-'0')*10+(arr[3]-'0'));
       return ans;
    
        
    }
}