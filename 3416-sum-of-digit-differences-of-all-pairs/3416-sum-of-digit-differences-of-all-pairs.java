class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n=nums.length;
        HashMap<Integer,HashMap<Character,Long>> hm=new HashMap<>();
        for(int num:nums)
        {
            String s=Integer.toString(num);
            int len=s.length();
            for(int i=0;i<len;i++)
            {
                hm.putIfAbsent(i,new HashMap<>());
                hm.get(i).put(s.charAt(i),hm.get(i).getOrDefault(s.charAt(i),0L)+1);
            }
        }
        long res=0;
        for(int num:nums)
        {
            String s=Integer.toString(num);
            int len=s.length();
            for(int i=0;i<len;i++)
            {
                res+=n-hm.get(i).get(s.charAt(i));
            }
        }
        return res/2;
    }
}
// https://www.youtube.com/watch?v=NmsizEmbL5M