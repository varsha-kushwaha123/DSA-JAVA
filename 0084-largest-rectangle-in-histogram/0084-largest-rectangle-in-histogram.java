class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] nse=new int[n];
        int [] pse=new int[n];
        Stack<Integer>stack=new Stack<>();
        int idx=n-1;
        for(int i=n-1;i>=0;i--){
             while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nse[idx]=n;
                stack.push(i);
                idx--;
            }
            else{
                nse[idx]=stack.peek();
                stack.push(i);
                idx--;
            }
        }
        stack.clear();
        idx=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();

            }
            if(stack.isEmpty()){
                pse[idx]=-1;
                stack.push(i);
                idx++;

            }
            
            else{
                pse[idx]=stack.peek();
                stack.push(i);
                idx++;
            }
        }
        int ans=0;
        for(int x=0;x<n;x++){
            int curr=heights[x]*(nse[x]-pse[x]-1);
            if(curr>ans){
                ans=curr;
            }
        }
        return ans;

    }
}