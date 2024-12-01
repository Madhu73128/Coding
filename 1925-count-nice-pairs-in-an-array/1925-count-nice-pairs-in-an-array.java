class Solution {
    public int countNicePairs(int[] nums) {
        int n=nums.length;
        long count=0;
        int m=1000000007;
        HashMap<Integer,Long> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int val=nums[i]-rev(nums[i]);
            count=(count+hm.getOrDefault(val,0L))%m;
            hm.put(val,hm.getOrDefault(val,0L)+1);
        }
        return (int)count%m;
    }
    public static int rev(int num)
    {
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
}