class Solution {
    public int thirdMax(int[] nums) {
         Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            
            if ((first != null && first == num) ||
                (second != null && second == num) ||
                (third != null && third == num)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } 
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        return third == null ? first.intValue() : third.intValue();
        
        
    }
}