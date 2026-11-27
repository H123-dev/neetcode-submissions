class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> s = new Stack<>();
        int max = heights[0];
        for(int i = 0 ; i<heights.length ; i++)
        {
            int crr = heights[i];
            int save = -1;
            while(!s.empty()&&crr<s.peek()[1])
            {
                int[] top = s.pop();
                save = top[0];
                int calc = (i-save)*top[1];
                max = Math.max(max,calc);
            }
            if(s.empty()||crr!=s.peek()[1])
            {
                if(save!=-1)
                    s.push(new int[]{save, heights[i]});
                else
                    s.push(new int[]{i, heights[i]});
            }
        }
        while(!s.empty()){
            int[] top = s.pop();
            int f = top[0];
            int calc = (heights.length-f)*top[1];
            max = Math.max(max,calc);
        }
        return max;
    }
}