class Solution {
    public int findFinalValue(int[] nums, int original) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int num:nums)
        // {
        //     hm.put(num,hm.getOrDefault(hm,0)+1);
        // }
        // while(hm.containsKey(original))
        // {
        //     original*=2;
        // }
        // return original;
        int idx=0;
        int n=nums.length;
        while(idx<n)
        {
            if(nums[idx]==original)
            {
                original*=2;
                idx=0;
            }
            else
            {
                idx++;
            }
        }
        return original;
    }
}