class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i<n-1&&nums[i]==nums[i+1])
            {
                continue;
            }
            else
            {
                nums[k++]=nums[i];
            }
        }
        return k;
    }

    // {
    //     int k=1;
    //     for(int i=1;i<nums.length;i++)
    //     {
    //         if(nums[i]!=nums[i-1])
    //         {
    //             nums[k++]=nums[i];
    //         }
    //     }
    //     return k;
    // }
}
// https://www.youtube.com/watch?v=xnj-GjdboGE
// https://www.youtube.com/watch?v=uWFuRAHFa2M   //Doubt