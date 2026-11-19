class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int [26];
        int left = 0;
        int max = 0;
        for(int right = 0 ; right<s.length() ; right++)
        {
            count[s.charAt(right)-'A']++;
            int indexMost = getMost(count);
            int window = right-left+1;
            if(window-count[indexMost]<=k)
                max = Math.max(max,window);
            else
            {
                char l = s.charAt(left);
                count[l-'A']--;
                left++;
            }
        }
        return max;
    }

    public int getMost(int [] a)
    {
        int max = 0;
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i]>a[max])
            {
                max = i;
            }
        }
        return max;
    }
}
