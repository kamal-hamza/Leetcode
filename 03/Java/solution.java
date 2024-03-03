class solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 0) {
            return 0;
        }

        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            String subString = "";
            for (int j = i; j < s.length(); j++) {
                String c = s.substring(j, j + 1);
                if (!subString.contains(c)) {
                    subString += c;
                }
                else {
                    break;
                }
            }
            if (subString.length() > length) {
                length = subString.length();
            }
        }
        return length;
    }
}