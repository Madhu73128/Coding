class Solution {
    public boolean checkRecord(String s) {
        int n=s.length();
        int abscnt=0;
        int latecnt=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A')
            {
                abscnt++;
                if(abscnt==2)
                return false;
            }
            if(ch=='L')
            {
                latecnt++;
                if(latecnt==3)
                return false;
            }
            else
            {
                latecnt=0;
            }
        }
        return true;
    }
}