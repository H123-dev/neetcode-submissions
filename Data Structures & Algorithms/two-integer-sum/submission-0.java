class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] rarr = new int [2];
        HashMap<Integer, Integer> indexes = new HashMap<Integer, Integer>();
        for(int i = 0 ; i <nums.length;i++)
        {
            if(!indexes.containsKey(nums[i]))
                indexes.put(nums[i],i);
            else
                if(nums[i]*2==target)
                {
                    rarr[0] = indexes.get(nums[i]);
                    rarr[1]= i;
                    return rarr;
                }
        }
        for(int i = 0 ; i <nums.length;i++)
        {
            int search = target-nums[i];
            if(indexes.containsKey(search)&&indexes.get(search)!=i)
            {
                rarr[0] = i;
                rarr[1] = indexes.get(search);
                return rarr;
            }
        }
        return null;
    }
}
