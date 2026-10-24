class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> r = new ArrayList<>();
        HashMap<HashMap<Character,Integer>,ArrayList<String>> records = new HashMap<>();
        for(int i = 0 ; i<strs.length;i++)
        {
            ArrayList<String> crrL = new ArrayList<>();
            String crr = strs[i];
            HashMap<Character,Integer> crrRecord = new HashMap<Character,Integer>();
            for(int j = 0 ; j<crr.length();j++)
            {
                char crrChar = crr.charAt(j);
                if(crrRecord.containsKey(crrChar))
                {
                    crrRecord.put(crrChar,crrRecord.get(crrChar)+1);
                }
                else
                {
                    crrRecord.put(crrChar,1);
                }
            }
            if(records.containsKey(crrRecord))
            {
                crrL = records.get(crrRecord);
                crrL.add(crr);
            }
            else
            {
                crrL.add(crr);
            }
            records.put(crrRecord,crrL);
        }
        for(HashMap<Character,Integer> key : records.keySet())
        {
            r.add(records.get(key));
        }
        return r;
    }
}
