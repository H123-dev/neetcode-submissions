class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer> isIn = new HashSet<>();
        for(int n : nums)
        {
            isIn.add(n);
        }
        int max = 1;
        int crr = 1;
        for(int key : isIn)
        {
            if(isIn.contains(key-1))
                continue;
            while(isIn.contains(key+1))
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
