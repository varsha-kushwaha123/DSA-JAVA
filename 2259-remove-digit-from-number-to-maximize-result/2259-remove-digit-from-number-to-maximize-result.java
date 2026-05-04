class Solution {
    public String removeDigit(String number, char digit) {
        
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) == digit && number.charAt(i) < number.charAt(i + 1)) {
                return number.substring(0, i) + number.substring(i + 1);
            }
        }

        int lastIndex = number.lastIndexOf(digit);
        return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
    }
}