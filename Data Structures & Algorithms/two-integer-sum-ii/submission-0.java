class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] r = new int [2];
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start]+numbers[end]!=target)
        {
            int left = target - numbers[start];
            if(numbers[end]>left)
                end--;
            else 
                start++;
        }
        r[0]=start+1;
        r[1]=end+1;
        return r;
    }
}
 