class Solution {
    public boolean wordPattern(String pattern, String s) {
        String strs[]=s.split(" ");

        int n=strs.length;
        int len=pattern.length();

        if(len!=n)
        return false;

        HashMap<Character,String> cts=new HashMap<>();//charToStr
        HashMap<String,Character> stc=new HashMap<>();//stringToChar

        for(int i=0;i<n;i++)
        {
            char ch=pattern.charAt(i);
            String word=strs[i];
            if(!cts.containsKey(ch))
            {
                cts.put(ch,word);
            }
            else
            {
                if(!cts.get(ch).equals(word))
                {
                    return false;
                }
            }

            if(!stc.containsKey(word))
            {
                stc.put(word,ch);
            }
            else
            {
                if(!stc.get(word).equals(ch))
                {
                    return false;
                }
            }
            // if(!hmw.containsKey(strs[i]))
            // {
            //     hmw.put(strs[i],i);
            // }
            // if(hmc.get(pattern.charAt(i))!=hmw.get(strs[i]))
            // {
            //     return false;
            // }
        }
        return true;
    }
}