class Solution(object):
    def mergeAlternately(self, word1, word2):
        
        ans = ''
        len1 = len(word1)
        len2 = len(word2)
        i = 0

        while i < len1 and i < len2:
            ans += word1[i]
            ans+= word2[i]
            i += 1

        ans += word1[i : len1]
        ans += word2[i : len2]

        return ans
    
sol = Solution()
print(sol.mergeAlternately("abcd", "pq"))
