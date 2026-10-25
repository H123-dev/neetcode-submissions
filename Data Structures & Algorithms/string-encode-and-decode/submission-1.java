class Solution {

    public String encode(List<String> strs) {
        String r ="";
        for(String crr : strs)
        {
            char rep = (char)crr.length();
            r += rep + crr;
        }
        return r;
    }

    public List<String> decode(String str) {
        List<String> r = new ArrayList<>();
        if(str.length()==0)
            return r;
        int l = (int)str.charAt(0);
        String crr ="";
        int i = 1;
        while(i<str.length())
        {
            char c = str.charAt(i);
            if(l>0)
            {
                crr+=c;
                l--;
            }
            else
            {
                r.add(crr);
                crr="";
                l=(int)c;
            }
            i++;
        }
        r.add(crr);
        return r;
    }
}
