class Solution {
    public String reorganizeString(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }

        int max=0,maxchar=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]>max)
            {
                max=freq[i];
                maxchar=i;
            }
        }

        int n=s.length();
        if(max>(n+1)/2)
        {
            return "";
        }

        //Fill all the even places with maxchar(majority) element
        char res[]=new char[n];
        int idx=0;
        while(freq[maxchar]-->0)
        {
            res[idx]=(char)(maxchar+'a');
            idx+=2;
        }
        //Fill all the remaining characters left
        for(int i=0;i<26;i++)
        {
            while(freq[i]-->0)
            {
                if(idx>=n)
                {
                    idx=1;
                }
                res[idx]=(char)(i+'a');
                idx+=2;
            }
        }
        return String.valueOf(res);
    }
}
// https://www.youtube.com/watch?v=wZENBuWh-C0