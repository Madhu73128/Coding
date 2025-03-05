class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0||s.length==0)
        return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int happy=0; //result
        int ch=0,ck=0;//child and cookies are initially 0's

        while(ch<g.length&&ck<s.length)
        {
            if(g[ch]<=s[ck])
            {
                happy++;// if curr ch is happy then we go for next ch with next ck
                ch++;
            }
            ck++;
        }
        return happy;
    }
}