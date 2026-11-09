class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int middle = (l+r)/2;
        while(l<r&&nums[middle]!=target)
        {
            int crr = nums[middle];
            if(crr<target)
            {
                l = middle+1;
                middle = (l+r)/2;
            }
            else
            {
                r= middle-1;
                middle = (l+r)/2;
            }
        }
        if(nums[middle]==target)
            return middle;
        return -1;
    }
}
