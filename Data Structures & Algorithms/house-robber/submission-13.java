class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return (MaxCost(nums,0,dp));
    }
    static int MaxCost(int[] nums,int ind,int[] dp){
        int n=nums.length;
     
        if(ind>=nums.length){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
       int r=nums[ind]+MaxCost(nums,ind+2,dp);
       int s=MaxCost(nums,ind+1,dp);
        return dp[ind]=Math.max(r,s);
    }
}
