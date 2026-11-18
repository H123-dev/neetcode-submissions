class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(""))
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 1;
        int crr = 0;
        int start = 0;
        for(int i = 0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c)&&start<map.get(c) +1)
            {
                start = map.get(c) +1 ;
                max = Math.max(i-(start) +1,max);
                max = Math.max(crr,max);
                crr=i-(start) +1;
            }
            else
                crr++;
            map.put(c,i);    
        }
        max = Math.max(crr,max);
        return max;
    }
}
