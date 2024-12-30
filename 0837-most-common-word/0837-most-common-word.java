class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hs=new HashSet<>();
        for(String s:banned)
        {
            hs.add(s);
        }
        hs.add("");//to handle below replaceAll b,b,b,c,... so on

        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll(","," ");
        paragraph=paragraph.replaceAll("[^ a-zA-Z]","");//ignoring a-z and A-Z and replacing remaining all by white space characters
        String strs[]=paragraph.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(String s:strs)
        {
            if(!hs.contains(s))
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        int max=Integer.MIN_VALUE;
        String res="";
        for(String key:hm.keySet())
        {
            if(hm.get(key)>max)
            {
                max=hm.get(key);
                res=key;
            }
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=5lYIBu4yP_w