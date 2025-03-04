class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int at=0,bt=0;

        for(int c:aliceSizes)
        {
            at+=c;
        }
        for(int c:bobSizes)
        {
            bt+=c;
        }

        int m=aliceSizes.length,n=bobSizes.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(at-aliceSizes[i]+bobSizes[j]==bt-bobSizes[j]+aliceSizes[i])
                {
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}