class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        long concatval=0;
        while(left<right)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(nums[left]).append(nums[right]);
            concatval+=Long.valueOf(sb.toString());
            left++;
            right--;
        }
        if(left==right)
        {
            concatval+=nums[left];
        }
        return concatval;
    }
}