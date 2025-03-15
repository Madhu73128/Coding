class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1)
        return nums[0];

        int max1=0;
        int ans1=0;
        for(int i=0;i<n-1;i++)//if we grab oth and n-1th index also then we will be caught that why we dont grab n-1th index
        {
            int curr=nums[i]+max1;
            max1=Math.max(max1,ans1);
            ans1=Math.max(ans1,curr);
        }

        int max2=0;
        int ans2=0;
        for(int i=1;i<n;i++)//if we grab oth and n-1th index also then we will be caught that why we dont grab 0th index
        {
            int curr=nums[i]+max2;
            max2=Math.max(max2,ans2);
            ans2=Math.max(ans2,curr);
        }

        return Math.max(ans1,ans2);// so we return ,max grabbed value from 2 cases shown above
    }
}