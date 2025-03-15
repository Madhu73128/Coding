class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int minbuy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(minbuy>prices[i])
            {
                minbuy=prices[i];
            }
            else if(prices[i]-minbuy>0)//this mean it is profit
            {
                res+=prices[i]-minbuy;
                minbuy=prices[i];
            }
        }
        return res;
    }
}