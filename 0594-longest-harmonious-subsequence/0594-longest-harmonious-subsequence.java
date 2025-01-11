class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int res=0;
        for(int num:hm.keySet())
        {
            if(hm.containsKey(num+1))
            {
                res=Math.max(res,hm.get(num)+hm.get(num+1));
            }
        }
        return res;
    }
}