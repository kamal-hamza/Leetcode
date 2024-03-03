class Solution {
    public String longestPalindrome(String s) { 
        String string = "";
        int stringLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int leftPointer = i;
            int rightPointer = i;
            while ((leftPointer >= 0 && rightPointer < s.length()) && (s.charAt(leftPointer) == s.charAt(rightPointer))) {
                if (rightPointer - leftPointer + 1 > stringLength) {
                    stringLength = rightPointer - leftPointer + 1;
                    string = s.substring(leftPointer, rightPointer + 1);
                }
                leftPointer--;
                rightPointer++;
            }
            leftPointer = i;
            rightPointer = i + 1;
            while ((leftPointer >= 0 && rightPointer < s.length()) && (s.charAt(leftPointer) == s.charAt(rightPointer))) {
                if (rightPointer - leftPointer + 1 > stringLength) {
                    stringLength = rightPointer - leftPointer + 1;
                    string = s.substring(leftPointer, rightPointer + 1);
                }
                leftPointer--;
                rightPointer++;
            }
        }
        return string;   
    }
}