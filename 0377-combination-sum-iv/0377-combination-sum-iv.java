class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        combinationsum(nums,target,dp);
        return dp[target];
    }
    public static int combinationsum(int nums[],int target,int dp[])
    {
        if(dp[target]>-1)//dp[target]!=-1
        return dp[target];
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=target)
            count+=combinationsum(nums,target-nums[i],dp);
        }
        dp[target]=count;
        return count;
    }
}