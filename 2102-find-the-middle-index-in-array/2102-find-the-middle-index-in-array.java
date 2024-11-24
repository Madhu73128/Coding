class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++)
        {
            totalsum+=nums[i];
        }
        int index=-1;
        int currsum=0;
        for(int i=0;i<n;i++)
        {
            totalsum-=nums[i];
            if(totalsum==currsum)
            {
                index=i;
                break;
            }
            currsum+=nums[i];
        }
        return index;
    }
}