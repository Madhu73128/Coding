class Solution {
    public int minSubarray(int[] nums, int p) {
        int n=nums.length;
        long totalsum=0;
        for(int i=0;i<n;i++)
        {
            totalsum+=nums[i];
        }
        int targetrem=(int)(totalsum%p);
        if(targetrem==0)
        {
            return 0;//since already divisible by p
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);//to handle subarrays starting from index 0
        long currsum=0;
        int res=n;//worst case:removing entire array return -1
        for(int i=0;i<n;i++)
        {
            currsum+=nums[i];
            int currrem=(int)(currsum%p);//currsum also may be long
            if(currrem<0)
            {
                currrem+=p;//for handling -ve rems
            }
            int desiredrem=(currrem-targetrem+p)%p;
            if(hm.containsKey(desiredrem))
            {
                res=Math.min(res,i-hm.get(desiredrem));//min of res, curr subarraylen
            }
            hm.put(currrem,i);//update hm with currrem
        }
        return res==n?-1:res;
    }
}