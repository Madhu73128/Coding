class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int winner=skills[0],winnerId=0,consecutiveWins=0;
        for(int i=1;i<skills.length;i++)
        {
            if(skills[i]>winner)
            {
                winner=skills[i];
                winnerId=i;
                consecutiveWins=0;
            }
            consecutiveWins++;
            if(consecutiveWins>=k)
            {
                break;
            }
        }
        return winnerId;
    }
}