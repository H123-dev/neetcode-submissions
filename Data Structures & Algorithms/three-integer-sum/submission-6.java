class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> r = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        for(int i = 0 ; i<nums.length-1;i++)
        {
            int start = i+1;
            int end = nums.length-1;
            while(start<end)
            {
                int sum = nums[i] + nums[start] + nums[end];
                if(sum==0)
                {
                    List<Integer> crr = new ArrayList<>();
                    crr.add(nums[i]);
                    crr.add(nums[start]);
                    crr.add(nums[end]);
                    if(!seen.contains(crr))
                    {
                        seen.add(crr);
                        r.add(crr);
                    }
                    start++;
                    end--;
                }
                else if (sum>0)
                    end--;
                else
                    start++;
            }
        }
        return r;
    }
}
