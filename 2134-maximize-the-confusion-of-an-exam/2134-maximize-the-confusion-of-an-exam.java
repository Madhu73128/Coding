class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int res=0;
        int maxcharfreq=0;
        int hash[]={0,0};
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(answerKey.charAt(right)=='F')
            {
                hash[0]++;
            }
            else
            {
                hash[1]++;
            }
            maxcharfreq=Math.max(maxcharfreq,Math.max(hash[0],hash[1]));
            int substringlen=right-left+1;
            int change=substringlen-maxcharfreq;
            if(change>k)
            {
               if(answerKey.charAt(left)=='F')
               {
                hash[0]--;
               }
               else
               {
                hash[1]--;
               }
                left++;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}