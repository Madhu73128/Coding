class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);//to handle subarrays starting from idx '0';
        int cnt=0;
        int currsum=0;
        for(int num:nums)
        {
            currsum+=num;
            if(hm.containsKey(currsum-k))
            {
                cnt+=hm.get(currsum-k);
            }
            hm.put(currsum,hm.getOrDefault(currsum,0)+1);
        }
        return cnt;
    }
}