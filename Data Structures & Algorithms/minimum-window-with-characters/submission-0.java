class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        int [] sArr = new int [52];
        int [] tArr = new int [52];
        for(int i = 0 ; i<t.length();i++)
        {
            addToArr(sArr,s.charAt(i));
            addToArr(tArr,t.charAt(i));
        }
        int left = 0;
        int right = left + t.length()-1;
        int [] pointers = new int [2];
        pointers[0] = -1; //indicatoor 
        while(right<s.length())
        {
            if(compare(sArr,tArr)==t.length())
            {
                while(compare(sArr,tArr)==t.length())
                {
                    if(pointers[0]==-1 || pointers[0]-pointers[1]+1 > right-left+1)
                    {
                        pointers[0] = right;
                        pointers[1] = left;
                    }
                    rmvFromArr(sArr,s.charAt(left));
                    left++;
                }
            }
            else
            {
                right++;
                if(right>=s.length())
                    break;
                addToArr(sArr,s.charAt(right));
            }
        }
        return s.substring(pointers[1],pointers[0]+1);
    }

    public int compare (int [] a , int [] b)
    {
        int c = 0;
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i]>=b[i]&&b[i]>=1)
                c+=b[i];
        }
        return c;
    }

    public void addToArr(int [] arr , char c)
    {
        if(c>='A'&&c<='Z')
            arr[c-'A']++;
        else
            arr[c-'a'+26]++;
    }

    public void rmvFromArr(int [] arr ,char c)
    {
        if(c>='A'&&c<='Z')
            arr[c-'A']--;
        else
            arr[c-'a'+26]--;
    }
}
