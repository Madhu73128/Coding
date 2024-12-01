class Solution {
    public long countBadPairs(int[] nums) {
        long goodpairscount=0;
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        //j-i!=nums[j]-nums[i]->j-nums[j]==i-nums[i](count good pairs and substract from total)
        for(int i=0;i<n;i++)
        {
            int val=i-nums[i];
            goodpairscount+=hm.getOrDefault(val,0);
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        long totalpairs=(long)n*(n-1)/2;
        long badpairscount=totalpairs-goodpairscount;
        return badpairscount;
    }
}