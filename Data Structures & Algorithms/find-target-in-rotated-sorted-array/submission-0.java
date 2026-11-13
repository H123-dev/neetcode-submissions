class Solution {
    public int search(int[] nums, int target) {
        int breakPoint = findMin(nums);

        //first hafl 

        int l = 0;
        int r = breakPoint-1;
        int m = (l+r)/2;
        while(l<=r)
        {
            if(nums[m]==target)
                return m;
            if(nums[m]>target)
            {
                r = m-1;
            }
            else
                l=m+1;
            m=(l+r)/2;
        }
        l = breakPoint;
        r = nums.length-1;
        m=(l+r)/2;
        while(l<=r)
        {
            if(nums[m]==target)
                return m;
            if(nums[m]>target)
            {
                r = m-1;
            }
            else
                l=m+1;
            m=(l+r)/2;
        }
        return -1;
    }
    

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
        return l;
    }
}
