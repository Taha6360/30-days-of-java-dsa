class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr = new int[2*n];
        int resultIndex = 0;
        for(int i = 0 ; i < n ; i++)
        {
            arr[resultIndex] = nums[i];
            resultIndex++;
            arr[resultIndex] = nums[n+i];
            resultIndex++;
        }
        return arr;
    }
}