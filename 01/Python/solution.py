class solution(object):
    def twoSum(self, nums, target):
        
        list = [-1]

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if (nums[i] + nums[j] == target):
                    list = [i, j]
                else:
                    continue
        
        return list
    
sol = solution()
print(sol.twoSum([3, 3], 6))