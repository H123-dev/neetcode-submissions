class Solution {
    public int trap(int[] height) {
        HashMap<Integer,Integer> maxMap = new HashMap<>();
        int max = -1;
        for(int i = height.length-1 ; i>0 ;i--)
        {
            int num = height[i];
            if(num>max)
            {
                max = num;
            }
            maxMap.put(i-1,max);
        }
        max = height[0];
        int sum = 0;
        for(int i = 1 ; i<height.length-1 ; i++)
        {
            int crr= Math.min(max,maxMap.get(i))-height[i];
            if(crr>0)
                sum+=crr;
            if(height[i]>max)
                max=height[i];
        }
        return sum;
    }
}
