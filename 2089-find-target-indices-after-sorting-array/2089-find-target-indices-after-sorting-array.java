class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int lowerNumCounts = 0 ;
        int targetRepeatance = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] < target){
                lowerNumCounts++;
            }
            else if(nums[i] == target){
                targetRepeatance++;
            }
        }
        for(int  i = 0 ; i < targetRepeatance ; i++){
            list.add(lowerNumCounts + i);
        }
        return list;

    }
}