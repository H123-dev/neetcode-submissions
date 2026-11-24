class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int [] result = new int [temps.length];
        Stack<Integer> tracker = new Stack<>();
        for(int i = 0 ; i<temps.length; i++)
        {
            while(!tracker.empty()&&temps[tracker.peek()]<temps[i])
            {
                int index = tracker.pop();
                result[index] = i-index;
            }
            tracker.push(i);
        }
        while(!tracker.empty())
        {
            result[tracker.pop()]=0;
        }
        return result;


    }
}
