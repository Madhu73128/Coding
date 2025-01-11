class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hmm=new HashMap<>();
        for(char ch:magazine.toCharArray())
        {
            hmm.put(ch,hmm.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray())
        {
            if(!hmm.containsKey(ch)||hmm.get(ch)<=0)
            {
                return false;
            }
            hmm.put(ch,hmm.get(ch)-1);
        }
        return true;
    }
}