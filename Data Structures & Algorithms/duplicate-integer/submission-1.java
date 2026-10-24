class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> save = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++)
        {
            if(save.containsKey(nums[i]))
                return true;
            save.put(nums[i],1);
        }
        return false;
    }
}