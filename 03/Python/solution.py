class solution(object):

    def lengthOfLongestSubstring(self, s):

        if (len(s) == 0):
            return 0

        length = 0
        for i in range(0, len(s)):
            subString = ""
            for j in range(i, len(s)):
                char = s[j : j + 1]
                if char not in subString:
                    subString += char
                else:
                    break
            if len(subString) > length:
                length = len(subString)

        return length
    
sol = solution()
print(sol.lengthOfLongestSubstring("abcabcbb"))