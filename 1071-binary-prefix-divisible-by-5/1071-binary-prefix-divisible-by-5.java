class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        // List<Boolean> res=new ArrayList<>();
        // int num=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     num+=nums[i]*Math.pow(2,n-i-1);
        //     // if(num%5==0)
        //     // res.add(true);
        //     // else
        //     // res.add(false);
        //     res.add(num%5==0);
        // }   
        // return res; //Not Working

        List<Boolean> res=new ArrayList<>();
        int val=0;
        for(int num:nums)
        {
            val=((val<<1)|num)%5;
            res.add(val==0);
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=Zha0f-ZIcdI