class Solution {
    public int minOperations(int[] nums) {
        int operation = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] >= nums[i+1]){
                int targetvalue = nums[i]+1;
                operation += (targetvalue - nums[i+1]);
                nums[i+1] = targetvalue;
            }
        }
        return operation;
    }
}