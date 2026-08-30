class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);

        return maxCost(nums,nums.length-1,dp);
    }
    static int maxCost(int[] nums,int ind,int[] dp){
        if(ind<0){
            return 0; 
        }
        if(ind==0){
            return nums[ind];
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=nums[ind]+maxCost(nums,ind-2,dp);
        int notpick=0+maxCost(nums,ind-1,dp);
       return dp[ind]=Math.max(pick,notpick);
    }
}
