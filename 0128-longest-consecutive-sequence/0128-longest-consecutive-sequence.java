class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len = 1,count = 1;

        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        for (int i = 1;i < nums.length;i++)
        {
            if (nums[i] == nums[i-1]) continue;
            if (nums[i] ==nums[i-1] + 1) 
            {
                len++;
            }
            else
            {
                len = 1;
            }
            count = Math.max(len,count);

            
        }
        return count;

    }
}