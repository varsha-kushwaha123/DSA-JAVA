class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        
        int mark = arr.length;


        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                arr[i - 1]--;
                mark = i;
            }
        }

        
        for (int i = mark; i < arr.length; i++) {
            arr[i] = '9';
        }
        return Integer.parseInt(new String(arr));
    }
}