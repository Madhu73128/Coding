class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,0);
        hm.put(1,0);
        hm.put(2,0);
        
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        int idx=0;
        for(int color=0;color<3;color++)
        {
            int frequency=hm.get(color);
            for(int i=0;i<frequency;i++)
            {
                nums[idx++]=color;
            }
        }
    }
}