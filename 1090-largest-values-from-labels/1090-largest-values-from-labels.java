class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
       int n=values.length;
       int[][]nums=new int[n][2];
       for(int i=0;i<n;i++){
        nums[i][0]=values[i];
        nums[i][1]=labels[i];
       }
       Arrays.sort(nums,(a,b) -> b[0]-a[0]);
        HashMap<Integer, Integer> count = new HashMap<>();
       int sum = 0;

        
        for (int i = 0; i < n && numWanted > 0; i++) {
            int value = nums[i][0];
            int label = nums[i][1];

            if (count.getOrDefault(label, 0) < useLimit) {
                sum += value;
                count.put(label, count.getOrDefault(label, 0) + 1);
                numWanted--;
            }
        }

        return sum;


        
    }
}