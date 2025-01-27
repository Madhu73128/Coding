class Solution {
    public String[] uncommonFromSentences(String s1, String s2)
    {
        String words1[]=s1.split(" ");
        String words2[]=s2.split(" ");
        HashMap<String,Integer> hm1=new HashMap<>();
        for(String word:words1)
        {
            hm1.put(word,hm1.getOrDefault(word,0)+1);
        }
        HashMap<String,Integer> hm2=new HashMap<>();
        for(String word:words2)
        {
            hm2.put(word,hm2.getOrDefault(word,0)+1);
        }
        List<String> al=new ArrayList<>();
        for(String word:hm1.keySet())
        {
            if(hm1.get(word)==1&&!hm2.containsKey(word))
            {
                al.add(word);
            }
        }
        for(String word:hm2.keySet())
        {
            if(hm2.get(word)==1&&!hm1.containsKey(word))
            {
                al.add(word);
            }
        }
        return al.toArray(new String[al.size()]);
    }
}