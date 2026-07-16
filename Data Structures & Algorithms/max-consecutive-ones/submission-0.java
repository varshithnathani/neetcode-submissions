class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0;
        int secMax = 0;
        for(int num: nums){
            if(num == 1){
                secMax++;
                maxNum = Math.max(maxNum, secMax);
            }else{
                secMax = 0;
            }
        }

        return maxNum;
    }
}