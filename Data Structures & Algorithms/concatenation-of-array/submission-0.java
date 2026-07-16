class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numsFinal = new int[nums.length *2];
        for(int i =0; i<nums.length; i++){
            numsFinal[i] = nums[i];
            numsFinal[nums.length+i] = nums[i];
        }
        return numsFinal;
    }
}