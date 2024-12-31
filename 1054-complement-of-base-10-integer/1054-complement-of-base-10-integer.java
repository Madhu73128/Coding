class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        return 1;
        int res=0;
        int multiplier=1;
        while(n>0)
        {
            int currbit=(n&1);
            res+=(currbit^1)*multiplier;
            multiplier<<=1;//multiplier*=2
            n>>=1;
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=jwezKgpxeig