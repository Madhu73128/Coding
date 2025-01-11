class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!hm.containsKey(ch)||hm.get(ch)<1)
            {
                return ch;
            }
            else
            {
                hm.put(ch,hm.get(ch)-1);
            }
        }
        return ' ';
    }
}