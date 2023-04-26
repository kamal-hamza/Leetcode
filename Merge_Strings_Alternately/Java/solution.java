class Solution {

    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder ans = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;

        while (i < len1 && i < len2) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
            i++;
        }

        ans.append(word1.substring(i, len1));
        ans.append(word2.substring(i, len2));

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.mergeAlternately("abcd", "pq");
    }
    
}