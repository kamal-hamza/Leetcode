class Solution {
    public int myAtoi(String s) {
        double ans = 0;
        int isNegative = 1;
        int i = 0;
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(i) == '+') {
            i++;
        }
        else if (s.charAt(i) == '-') {
            i++;
            isNegative = -1;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans = (ans * 10) + Character.getNumericValue(s.charAt(i));
            i++;
        }

        ans = ans * isNegative;

        ans = (ans > Integer.MAX_VALUE) ? Integer.MAX_VALUE : ans;
        ans = (ans < Integer.MIN_VALUE) ? Integer.MIN_VALUE : ans;

        return (int)ans;


    }
}