class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum=0;
        for (int i = nums.length - 1; i >= 0 && k > 0; i--) {
            if (mul > 0) {
                sum += 1L * nums[i] * mul;
                mul--;
            } else {
                sum += nums[i];
            }
            k--;
        }

        return sum;
        
    }
}