class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n=word.length();
        int res[]=new int[n];
        // int val=0;
        long val=0;
        for(int i=0;i<n;i++)
        {
            val=(val*10+word.charAt(i)-'0')%m;
            //int rem=(int)(val%m);
            // if(rem==0)
            if(val==0)
            {
                res[i]=1;
            }
            else
            {
                res[i]=0;
            }
        }
        return res;
    }
}