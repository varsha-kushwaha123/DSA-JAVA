class Solution {
    public int distMoney(int money, int children) {
        if(money< children) return -1;
         money -= children;

        int ans = Math.min(money / 7, children);

        money -= ans * 7;

     
        if (ans == children && money == 0) {
            return ans;
        }

        if (ans == children - 1 && money == 3) {
            return ans - 1;
        }

        if (ans == children) {
            return children - 1;
        }
        return ans;

        
    }
}