class Solution
{
    public int countWords(String[] words1, String[] words2)
    {
        HashMap<String,Integer> hm1=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        for(String word:words1)
        {
            hm1.put(word,hm1.getOrDefault(word,0)+1);
        }   
        for(String word:words2)
        {
            hm2.put(word,hm2.getOrDefault(word,0)+1);
        }
        int cnt=0;
        for(String word:words1)
        {
            if(hm1.containsKey(word)&&hm2.containsKey(word)&&hm1.get(word)==1&&hm2.get(word)==1)
            {
                cnt++;
            }
        }
        return cnt;
    }
}