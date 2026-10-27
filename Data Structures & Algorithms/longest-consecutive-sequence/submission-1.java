class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashMap<Integer,Boolean> isIn = new HashMap<>();
        for(int n : nums)
        {
            if(!isIn.containsKey(n))
            {
                isIn.put(n,true);
            }
        }
        int max = 1;
        int crr = 1;
        for(int key : isIn.keySet())
        {
            if(isIn.containsKey(key-1))
                continue;
            while(isIn.containsKey(key+1))
            {
                key++;
                crr++;
            }
            if(crr>max)
                max=crr;
            crr=1;
        }
        return max;
    }
}
