class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        slow=nums[slow];
        fast=nums[nums[fast]];
        while(fast!=slow)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        int i = nums[0];
        while(fast!=i)
        {
            fast=nums[fast];
            i=nums[i];
        }
        return i;
    }
}
