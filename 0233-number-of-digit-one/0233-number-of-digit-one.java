class Solution {
    public int countDigitOne(int n) {
        if(n<=0)
        return 0;

        int q=n,x=1,res=0;

        while(q!=0)
        {
            int rem=q%10;
            q=q/10;

            res+=q*x;

            if(rem==1)
            res+=n%x+1;

            if(rem>1)
            res+=x;
            
            x=x*10;
        }
        return res;
    }
}