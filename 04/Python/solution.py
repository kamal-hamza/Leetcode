class solution(object):

    def findMedianSortedArray(self, nums1, nums2):
        nums =  nums1 + nums2
        nums.sort()
        length = len(nums)
        if length % 2 == 0:
            median = float((nums[int(len(nums) / 2)] + nums[int(len(nums) / 2 - 1)])) / 2
        elif length % 2 == 1:
            median = nums[(len(nums) / 2)]
        else:
            median = -1

        return median

sol = solution()
nums1 = [1, 2]
nums2 = [3, 4]
print(sol.findMedianSortedArray(nums1, nums2))