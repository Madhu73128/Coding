class Solution 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        int slen=s.length(),plen=p.length();
        List<Integer> res=new ArrayList<>();
        if(plen>slen)
        return res;

        int pCount[]=new int[26];
        int sCount[]=new int[26];

        // Populate frequency count for `p`
        for(char c:p.toCharArray()) 
        {
            pCount[c-'a']++;
        }

        // Sliding window
        for(int i=0;i<slen;i++) 
        {
            // Add current character to the window
            sCount[s.charAt(i)-'a']++;

            // Remove the leftmost character when the window exceeds the length of `p`
            if(i>=plen) 
            {
                sCount[s.charAt(i-plen)-'a']--;
            }

            // Compare counts: if equal, add the start index of the window
            if(Arrays.equals(pCount,sCount))
            {
                res.add(i-plen+1);//adding 1 since 0 index
            }
        }
        return res;
    }
}