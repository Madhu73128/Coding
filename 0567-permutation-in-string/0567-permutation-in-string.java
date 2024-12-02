class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int slen=s2.length(),plen=s1.length();
        if(plen>slen)
        return false;
        int sCount[]=new int[26];
        int pCount[]=new int[26];
        for(char ch:s1.toCharArray())
        {
            pCount[ch-'a']++;
        }
        for(int i=0;i<slen;i++)
        {
            sCount[s2.charAt(i)-'a']++;
            if(i>=plen)
            {
                sCount[s2.charAt(i-plen)-'a']--;
            }
            if(Arrays.equals(sCount,pCount))
            {
                return true;
            }
        }
        return false;
    }
}