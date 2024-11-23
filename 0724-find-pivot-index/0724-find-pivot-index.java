class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++)
        {
            totalsum+=nums[i];
        }
        int currsum=0;
        int res=-1;
        for(int i=0;i<n;i++)
        {
            totalsum-=nums[i];
            if(totalsum==currsum)
            {
                res=i;
                break;
            }
            currsum+=nums[i];
        }
        return res;
    }
}