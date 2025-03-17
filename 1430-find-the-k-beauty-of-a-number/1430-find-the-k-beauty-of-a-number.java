class Solution {
    public int divisorSubstrings(int num, int k) {
        int res=0;

        String s=Integer.toString(num);
        int n=s.length();
        
        for(int i=0;i<n-k+1;i++)
        {            
            int divisor=Integer.parseInt(s.substring(i,i+k));
            if(divisor!=0&&num%divisor==0)
            {
                res++;
            }
        }

        return res;
    }
}