class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            if(hm.containsKey(Arrays.toString(ch)))
            {
                hm.get(Arrays.toString(ch)).add(s);
            }
            else
            {
                List<String> al=new ArrayList<>();
                al.add(s);
                hm.put(Arrays.toString(ch),al);
            }
        }
        for(List<String> hmlist:hm.values())
        {
            res.add(hmlist);
        }
        return res;
    }
}