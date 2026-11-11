class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 0 ; i<piles.length ;i++)
            max = Math.max(max,piles[i]);
        int min = 1;
        int mid = (min+max)/2;
        while(min<=max)
        {
            if(check(mid,piles,h))
            {
                max=mid-1;
            }
            else
            {
                min = mid+1;
            }
            mid = (min+max)/2;
        }
        return min;
    }

    public boolean check(int k, int [] piles , int h)
    {
        int i = 0;
        while(i<piles.length)
        {
            if(h<=0)
                return false;
            int crr = piles[i];
            int amount = crr/k;
            if(crr%k!=0)
                amount++;
            h-=amount;
            i++;
        }
        return h>=0;
    }
}
