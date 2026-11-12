class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int mid = (l+r)/2;
        while(l<r)
        {
            if(nums[l]>nums[mid])
            {
                r = mid;
            }
            else if(nums[mid]>nums[r])
            {
                l = mid+1;
            }
            else
                break;
            mid = (l+r)/2;
        }
        return nums[l];
    }
}
