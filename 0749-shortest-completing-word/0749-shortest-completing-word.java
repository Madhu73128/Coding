class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int required_cnt[]=new int[26];
        for(char ch:licensePlate.toLowerCase().toCharArray())
        {
            if(Character.isLetter(ch))
            {
                required_cnt[ch-'a']++;
            }
        }
        int len=Integer.MAX_VALUE;
        String res="";
        for(String word:words)
        {
            if(word.length()<len&&isSatisfy(word,required_cnt))
            {
                res=word;
                len=word.length();
            }
        }
        return res;
    }
    public static boolean isSatisfy(String word,int required_cnt[])
    {
        int curr_cnt[]=new int[26];
        for(char ch:word.toLowerCase().toCharArray())
        {
            curr_cnt[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(curr_cnt[i]<required_cnt[i])
            {
                return false;
            }
        }
        return true;
    }
}