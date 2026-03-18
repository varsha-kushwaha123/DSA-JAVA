class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;

        while (i < flowerbed.length) {

            if (flowerbed[i] == 0) {

                if (i == 0) {
                    if (flowerbed.length == 1 || flowerbed[i + 1] == 0) {
                        n--;
                        if (n == 0) return true;
                        i += 2;
                        continue;
                    }
                } 
                else if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        n--;
                        if (n == 0) return true;
                        i += 2;
                        continue;
                    }
                } 
                else {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        n--;
                        if (n == 0) return true;
                        i += 2;
                        continue;
                    }
                }
            }

            i++; 
        }

        return n <= 0;
    }
}