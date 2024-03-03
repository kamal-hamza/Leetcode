class Solution {
    public int reverse(int x) {
        int isNegative = 1;
        int input = x;
        int ans = 0;
        if (input < 0) {
            isNegative = -1;
        }

        input = input * isNegative;
        int lastDigit = 0;

        while (input > 0) {
            lastDigit = input % 10;
            input = input / 10;
            int overflow = ans;
            if ((long)ans * (long)10 + (long)lastDigit > Integer.MAX_VALUE) {
                return 0;
            }
            ans = (ans * 10) + lastDigit;
        }

        ans = ans * isNegative;
        return ans;
    }
}
