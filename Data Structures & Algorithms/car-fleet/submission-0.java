class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<position.length ;i++)
        {
            map.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        Stack<Double> s = new Stack<>();
        double hops =(double) (target - position[position.length-1]) / map.get(position[position.length-1]);
        s.push(hops);
        for(int i = position.length-2 ;i>=0;i--)
        {
            int crr = position[i];
            hops = (double)(target-crr) / map.get(crr);
            if(s.peek()<hops)
                s.push(hops);
        }
        return s.size();
    }
}
