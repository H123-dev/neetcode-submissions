class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] result = new int [nums.length-k+1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int left = 0;
        int right = 0;
        while(right<k)//firt itr of 1st k window aka 121 in exmnpel
        {
            int crr = nums[right];
            while(dq.peekLast()!=null&&dq.peekLast()<crr)
            {
                dq.pollLast();
            }
            dq.offerLast(crr);
            right++;
        }
        int resultIndex = 0;
        result[resultIndex] = dq.peekFirst();
        resultIndex++;
        if(dq.peekFirst()==nums[left])
            dq.pollFirst();
        left++;
        //enter main loop on 2nd window aka 210= in emxple
        while(right<nums.length)
        {
            int crr = nums[right];
            while(dq.peekLast()!=null&&dq.peekLast()<crr)
            {
                dq.pollLast();
            }
            dq.offerLast(crr);
            result[resultIndex] = dq.peekFirst();
            resultIndex++;
            right++;
            if(dq.peekFirst()==nums[left])
                dq.pollFirst();
            left++;
        }
        return result;
    }
}
