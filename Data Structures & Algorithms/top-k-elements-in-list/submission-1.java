class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] r = new int [k];
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        int j = 0;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++)
        {
            if(count.containsKey(nums[i]))
            {
                count.put(nums[i],count.get(nums[i])+1);
            }
            else
                count.put(nums[i],1);
        }
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = new ArrayList<Integer>();
        }
        for(int key : count.keySet())
        {
            arr[count.get(key)].add(key);
        }
        for(int i = arr.length-1;i>=0;i--)
        {
            if(j==k)
            {
                return r;
            }
            if(arr[i].size()!=0)
            {
                for(int val : arr[i])
                {
                    if(j==k)
                        return r;
                    r[j]=val;
                    j++;
                }
            }
        }
        return r;
    }
}
