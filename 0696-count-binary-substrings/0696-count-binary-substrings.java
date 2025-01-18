class Solution {
    public int countBinarySubstrings(String s) {
        int pc=0,cc=1,c=0;//prev_count,curr_count,count
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                cc++;
            }
            else
            {
                c+=Math.min(pc,cc);
                pc=cc;
                cc=1;
            }
        }
        return c+Math.min(pc,cc);
    }
}