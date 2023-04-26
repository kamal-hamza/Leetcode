class Solution(object):
    def countMatches(self, items, ruleKey, ruleValue):
        
        index = 0
        numMatches = 0

        if ruleKey == "color":
            index = 1
        elif ruleKey == "type":
            index = 0
        else:
            index = 2

        for i in range(len(items)):
            list = items[i]
            if list[index] == ruleValue:
                numMatches += 1
        
        return numMatches
    
items = [["phone", "blue", "pixel"], ["computer", "silver", "lenovo"], ["phone", "gold", "iphone"]]    
sol = Solution()
print(sol.countMatches(items, "color", "silver"))
