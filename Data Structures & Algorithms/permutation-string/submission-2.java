class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
            return false;
        int [] a1 = new int [26];
        int [] a2 = new int [26];
        for(int i = 0 ; i<s1.length() ;i++)
        {
            a1[s1.charAt(i)-'a']++;
            a2[s2.charAt(i)-'a']++;
        }
        int left =0;
        int right = left + s1.length()-1;
        while(right+1<s2.length()&&compare(a1,a2)!=26)
        {
            a2[s2.charAt(left)-'a']--;
            left++;
            right++;
            a2[s2.charAt(right)-'a']++;
        }
        return compare(a1,a2)==26;
                
    }

    public int compare (int [] a , int [] b)
    {
        int c = 0;
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i]==b[i])
                c++;
        }
        return c;
    }
}
