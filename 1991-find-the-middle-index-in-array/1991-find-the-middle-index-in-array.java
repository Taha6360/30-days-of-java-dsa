class Solution {
    public int findMiddleIndex(int[] nums) {
        int TotalSum = 0;
        int LeftSum = 0;
        for(int i = 0 ;i<nums.length ; i++){
            TotalSum += nums[i];
        }
        for(int i = 0 ; i<nums.length ; i++){
            int RightSum = TotalSum - LeftSum - nums[i];
            if(RightSum == LeftSum){
                return i;
            }
            else{
                LeftSum += nums[i];
            }
        }
        return -1;
    }
}