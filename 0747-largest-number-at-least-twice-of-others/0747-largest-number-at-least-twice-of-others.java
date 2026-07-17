class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if(largest>=2*secondLargest){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==largest) return i;
            }
        }
        return -1;
    }
}