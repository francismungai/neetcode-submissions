class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        table = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in table:
                return [table[complement], i]
            
            table[num] = i