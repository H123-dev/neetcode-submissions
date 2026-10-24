class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> records = new HashMap<>();
        for (String s : strs) 
        {
            char[] count = new char[26];
            for (char c : s.toCharArray())
            {
                int index = (int)c -'a';
                count[index]++;
            }
            String key = new String(count);         
            records.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(records.values());
    }
}
