class Solution {
    public boolean isPalindrome(String s) {
        String ns ="";
        for(int i = 0 ; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='z' || c<='9' && c>='0')
            {
                ns+=c;
            }
            if(c>='A'&&c<='Z')
            {
                char nc = (char)((int)c+(int)('a'-'A'));
                ns+=nc;
            }
        }
        int start = 0;
        int end = ns.length()-1;
        while(start<end&&ns.charAt(start)==ns.charAt(end))
        {
            end--;
            start++;
        }
        if(start>=end)
            return true;
        return false;
    }
}
