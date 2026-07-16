class Solution {
    public int removeElement(int[] nums, int val) {
        int dummy =0;
        for(int num: nums){
            if(num != val){
                nums[dummy] = num;
                dummy++;
            }
        }

        return dummy;
        
    }
}