class Solution {
    public List<String> cellsInRange(String s) {
        String splitted[]=s.split(":");
        char startchar=splitted[0].charAt(0);
        int startrange=Integer.valueOf(splitted[0].charAt(1)-'0');
        char endchar=splitted[1].charAt(0);
        int endrange=Integer.valueOf(splitted[1].charAt(1)-'0');
        List<String> res=new ArrayList<>();
        for(char ch=startchar;ch<=endchar;ch++)
        {
            for(int range=startrange;range<=endrange;range++)
            {
                res.add(new StringBuilder().append(ch).append(range).toString());
            }
        }
        return res;
    }
}