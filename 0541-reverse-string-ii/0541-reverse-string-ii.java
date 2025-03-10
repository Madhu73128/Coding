class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i+=(2*k))
        {
            int start=i;
            int end=Math.min(n-1,i+k-1);
            while(start<end)
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}