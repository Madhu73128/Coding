class Solution {
    public int countCharacters(String[] words, String chars)
     {
        HashMap<Character,Integer> hm=new HashMap<>();

        // Store frequency of characters in 'chars'
        for (char ch:chars.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int res=0;
        for (String s:words)
        {
            HashMap<Character, Integer> hm2=new HashMap<>(hm); // Copy of original map
            boolean flag=true;

            for(char c:s.toCharArray())
             {
                if (!hm2.containsKey(c)||hm2.get(c)==0)
                 {
                    flag=false;
                    break;
                }
                hm2.put(c,hm2.get(c)-1);
            }

            if (flag)
            {
                res+=s.length();
            }
        }

        return res;
    }
}