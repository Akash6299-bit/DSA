class Solution {

    public int find(int[] nums, int index, int[]dp){
        if(index>=nums.length){
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int skip = find(nums, index + 1, dp);

        int take = nums[index] + find(nums, index + 2, dp);

        dp[index] = Math.max(skip, take);

        return dp[index];

    
    }
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp, -1);

        return find(nums, 0, dp);
        
    }
}