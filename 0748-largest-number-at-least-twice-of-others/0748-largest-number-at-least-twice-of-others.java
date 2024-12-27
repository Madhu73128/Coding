class Solution {
    public int dominantIndex(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int ans=-1;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]>max)
        //     {
        //         max=nums[i];
        //         ans=i;
        //     }
        // }
        // boolean flag=false;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=max&&(nums[i]*2)<=max)
        //     {
        //         flag=true;
        //     }
        //     else
        //     {
        //         flag=false;
        //     }
        // }
        // if(flag)
        // return ans;
        // else
        // return -1;//Not Working

        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            if(num>max)
            {
                max=num;
            }
        }
        int res=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==max)
            {
                res=i;
                continue;
            }
            if(nums[i]*2>max)
            {
                return -1;
            }
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=V9yJ6uY84F8