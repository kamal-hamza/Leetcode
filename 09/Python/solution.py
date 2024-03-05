class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        reversed = 0
        y = x
        while y > 0:
            reversed = reversed * 10 + y % 10
            y //= 10
        return x == reversed