class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> hms=new HashMap<>();
        HashMap<Character,Integer> hmt=new HashMap<>();
        if(s.length()!=t.length())
        return false;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(!hms.containsKey(s.charAt(i)))
            {   
                hms.put(s.charAt(i),i);
            }
            if(!hmt.containsKey(t.charAt(i)))
            {
                hmt.put(t.charAt(i),i);
            }
            if(!hms.get(s.charAt(i)).equals(hmt.get(t.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}