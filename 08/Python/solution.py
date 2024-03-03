class Solution(object):
    def myAtoi(self, s):
        isNegative = 1
        ans = 0
        s = s.strip()
        i = 0
        if not s:
            return 0
        
        if (s[i] == "+"):
            i = i + 1
        elif (s[i] == "-"):
            i = i + 1
            isNegative = -1
        
        while i < len(s) and s[i].isdigit():
            ans = (ans * 10) + int(s[i])
            i = i + 1

        ans = ans * isNegative

        ans = max(min(ans, 2 ** 31 - 1), -2 ** 31)

        return ans
    