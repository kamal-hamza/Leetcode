class Solution(object):
    def longestPalindrome(self, s):
        stringLength = 0

        for i in range(0, len(s)):
            leftPointer = i
            rightPointer = i
            while (leftPointer >= 0 and rightPointer < len(s)) and (s[leftPointer] == s[rightPointer]):
                if rightPointer - leftPointer + 1 > stringLength:
                    stringLength = rightPointer - leftPointer + 1
                    string = s[leftPointer : rightPointer + 1]
                
                leftPointer -= 1
                rightPointer += 1

            leftPointer = i
            rightPointer = i + 1
            while (leftPointer >= 0 and rightPointer < len(s)) and (s[leftPointer] == s[rightPointer]):
                if rightPointer - leftPointer + 1 > stringLength:
                    stringLength = rightPointer - leftPointer + 1
                    string = s[leftPointer : rightPointer + 1]
                
                leftPointer -= 1
                rightPointer += 1

        return string