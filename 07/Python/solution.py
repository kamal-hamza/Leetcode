class Solution(object):
    def reverse(self, x):
        isNegative = 1
        input = x
        ans = 0
        if (input < 0):
            isNegative = -1

        input = input * isNegative

        while (input > 0):
            lastDigit = input % 10
            input = input // 10
            ans = (ans * 10) + lastDigit
        
        ans = ans * isNegative
        if (ans.bit_length() < 32):
            return ans
        else:
            return 0