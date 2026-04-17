class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                counter++;
            }
            else
            {
                max = Math.max(max, counter);
                counter = 0;

            }
        }

        return Math.max(max,counter);
    }
}