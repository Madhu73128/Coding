class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                sb.append(String.valueOf(ch).repeat(Math.max(0,hm.get(ch))));
                hm.remove(ch);
            }
        }
        for(char ch:hm.keySet())
        {
            sb.append(String.valueOf(ch).repeat(Math.max(0,hm.get(ch))));
        }
        return sb.toString();
    }
}