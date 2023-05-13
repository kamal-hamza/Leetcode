class solution(object):

    def numSubSeq(self, nums, target):
        matches = self.numSubSeqRecurse(nums, target, 0)
        return matches

    def numSubSeqRecurse(self, nums):

        if (len(nums) == 0):
            return [[]]
        elif (len(nums) == 1):
            return [[nums[0], nums[0]]]
        elif (len(nums) == 2):
            return [[nums[0], nums[0]], [nums[0], nums[1]]]
        
        subRest = self.numSubSeqRecurse(nums[1 :])
        return nums[0 : 1] + subRest + self.addElement(subRest, nums[0 : 1])
    
    def addElement(self, nums):
        list = []
        for element in nums:
            num = [element] + [1]
            list.append(num)

        return list



    
sol = solution()
print(sol.numSubSeq([3,5,6,7], 9))
