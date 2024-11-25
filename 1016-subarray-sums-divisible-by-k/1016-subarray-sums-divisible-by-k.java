class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);//to handle subbarrays starting from index '0';
        int currsum=0;
        for(int i=0;i<n;i++)
        {
            currsum+=nums[i];
            int rem=currsum%k;
            if(rem<0)
            {
                rem+=k;
            }
            /*if(hm.containsKey(rem)&&hm.get(rem)!=null)
            {
                cnt+=hm.get(rem);
            }*/
            cnt+=hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}