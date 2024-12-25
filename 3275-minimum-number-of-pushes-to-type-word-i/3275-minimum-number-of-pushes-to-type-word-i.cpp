class Solution {
public:
    int minimumPushes(string word) {
        int res=0;
        int len=word.length();
        int cantake=0;
        int pushcounts=1;
        while(len>0)
        {
            if(len>=8)
            {
                cantake=8;
            }
            else
            {
                cantake=len;
            }
            res+=pushcounts*cantake;
            len=len-cantake;
            pushcounts++;
        }
        return res;
    }
};