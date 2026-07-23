class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        
        left_running_product = 1
        for i in range(len(nums)):
            res[i] = left_running_product
            left_running_product *= nums[i]

        right_running_product = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] *= right_running_product
            right_running_product *= nums[i]

        return res
        
        