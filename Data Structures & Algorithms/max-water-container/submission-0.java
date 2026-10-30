class Solution {
    public int maxArea(int[] heights) 
    {
        int area = 0;
        int maxArea = 0;
        int start = 0;
        int end = heights.length-1;
        while(start<end)
        {
            area = (end-start)*Math.min(heights[end],heights[start]);
            if(area>maxArea)
                maxArea=area;
            if(heights[start]<heights[end])
                start++;
            else
                end--;
        }  
        return maxArea; 
    }
}
