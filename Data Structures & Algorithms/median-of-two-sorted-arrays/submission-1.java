class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        if(nums2.length<nums1.length)
        {
            int [] t = nums1;
            nums1 = nums2;
            nums2 = t;
        }
        int total = nums1.length + nums2.length;
        int half = total/2;
        int l1 = 0;
        int r1 = nums1.length-1;
        while(true)
        {
            int m1 = (l1+r1!=-1) ? (l1+r1)/2 : -1;
            int m2 = half -m1 -2;
            double aLeft = (m1>=0) ? nums1[m1] : negInf;
            double bLeft = (m2>=0) ? nums2[m2] : negInf;
            double aRight = (m1+1<nums1.length) ? nums1[m1+1] : posInf;
            double bRight = (m2+1<nums2.length) ? nums2[m2+1] : posInf;
            if(aLeft<=bRight)
            {
                if(bLeft<=aRight)
                {
                    if(total%2==0)
                    {
                        double max = Math.max(aLeft,bLeft);
                        double min = Math.min(bRight,aRight);
                        return (min+max)/2.0;
                    }
                    return Math.min(aRight,bRight);
                }
                else
                    l1 = m1+1;
            }
            else 
                r1 = m1-1;
        }
    }
}
