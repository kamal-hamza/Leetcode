import java.util.Arrays;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String [] rows = new String[numRows];
        Arrays.fill(rows, "");
        boolean goingUp = true;
        int rowIndex = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String str = String.valueOf(c);
            rows[rowIndex - 1] += str;
            if (rowIndex == numRows) {
                goingUp = false;
            }
            else if (rowIndex == 1) {
                goingUp = true;
            }
            if (goingUp) {
                rowIndex++;
            }
            else if (!goingUp) {
                rowIndex--;
            }
        }
        String ans = String.join("", rows);
        return ans;
    }
}