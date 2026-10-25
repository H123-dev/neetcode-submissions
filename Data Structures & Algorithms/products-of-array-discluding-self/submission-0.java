class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        boolean seen = false;
        for(int num : nums)
        {
            if(num!=0)
                total*=num;
            else if(seen)
            {
                total=0;
                break;
            }
            else
                seen=true;
        }
        int [] output = new int [nums.length];
        for(int i = 0 ; i<output.length;i++)
        {
            if(seen)
            {
                if(nums[i]==0)
                    output[i]=total;
                else
                    output[i]=0;
            }
            else
            {
                output[i]=total/nums[i];
            }
        }
        return output;
    }
}  
