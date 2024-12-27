class Solution {
    public int minimizeArrayValue(int[] nums) {
        long res=0,preSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            preSum+=nums[i];
            res=Math.max(res,(preSum+i)/(i+1));
        }
        return (int)res;
    }
}
// https://www.youtube.com/watch?v=AeHMvcKuR0Y
// https://www.youtube.com/watch?v=DAQHXe1yNtM