class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<=1)
        return false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);//to handle subarrys starting from index '0';
        int prefixsum=0;
        for(int i=0;i<n;i++)
        {
            prefixsum+=nums[i];
            int modval=prefixsum%k;
            if(hm.containsKey(modval))
            {
                if(i-hm.get(modval)>=2)
                return true;
            }
            else
            hm.put(modval,i);
        }
        return false;
    }
}