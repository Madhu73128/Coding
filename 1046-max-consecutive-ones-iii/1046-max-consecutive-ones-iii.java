class Solution {
    public int longestOnes(int[] nums, int k) {
        //youtube strivers-longest subarray with atmost k zeros is the logic
        //2 pointers + sliding window approach
        int n=nums.length;
        int res=0;
        //int hash[]={0,0};
        //int maxintfreq=0;
        int zeroscnt=0;
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
               // hash[0]++;
               zeroscnt++;
            }
            /*else
            {
                hash[1]++;
            }
            maxintfreq=Math.max(maxintfreq,Math.max(hash[0],hash[1]));
            int substringlen=right-left+1;
            int change=substringlen-maxintfreq;*/
            if(zeroscnt>k)
            {
                if(nums[left]==0)
                {
                    //hash[0]--;
                    zeroscnt--;
                }
                /*else
                {
                    hash[1]--;
                }*/
                left++;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}