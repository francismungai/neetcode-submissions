class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (!list.add(nums[i])) {
                return true;
            }
        } 

        return false;
    }
}
