class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long maxh=0;
        long maxv=0;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

         maxh=Math.max(maxh,horizontalCuts[0]-0);
        for(int i=0;i<horizontalCuts.length-1;i++){
            maxh=Math.max(maxh,horizontalCuts[i+1]-horizontalCuts[i]);
        }
        maxh=Math.max(maxh,h-horizontalCuts[horizontalCuts.length-1]);
        maxv=Math.max(maxv,verticalCuts[0]-0);
        for(int i=0;i<verticalCuts.length-1;i++){
            maxv=Math.max(maxv,verticalCuts[i+1]-verticalCuts[i]);
        }
        maxv=Math.max(maxv,w-verticalCuts[verticalCuts.length-1]);

        long mod = 1000000007;

        return (int)((maxh*maxv)%mod);
    }
}