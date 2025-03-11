class Solution {
    public int findMaximumXOR(int[] nums) {

        int maxnum=Arrays.stream(nums).max().getAsInt();

        int maxbit=(int)(Math.log(maxnum)/Math.log(2));

        int mask=0,res=0;

        for(int i=maxbit;i>=0;i--)
        {
            mask=mask|(1<<i);

            HashSet<Integer> prefixes=new HashSet<>();
            for(int num:nums)
            {
                prefixes.add(num&mask);
            }

            int candidate=res|(1<<i);

            for(int prefix:prefixes)
            {
                if(prefixes.contains(prefix^candidate))
                {
                    res=candidate;
                    break;
                }
            }
        }

        return res;
    }
}