class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        for(int i = 0 ; i<s.length();i++)
        {
            char crr = s.charAt(i);
            if(hs.containsKey(crr))
                hs.put(crr,hs.get(crr)+1);
            else
                hs.put(crr,1);
        }
        for(int i = 0 ; i<t.length();i++)
        {
            char crr = t.charAt(i);
            if(hs.containsKey(crr))
            {
                int count = hs.get(crr)-1;
                if(count==0)
                    hs.remove(crr);
                else
                    hs.put(crr,count);
            }
            else
                return false;
        }
        if(hs.keySet().size()!=0)
            return false;
        return true;
    }
}
