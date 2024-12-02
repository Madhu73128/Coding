class Solution {//youtube neetcode
    public String minWindow(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        if(tlen>slen||t.isEmpty()||t==null)
        return "";
        HashMap<Character,Integer> hmt=new HashMap<>();
        for(char ch:t.toCharArray())
        {
            hmt.put(ch,hmt.getOrDefault(ch,0)+1);
        }
        int need=hmt.size(),have=0;
        HashMap<Character,Integer> hms=new HashMap<>();
        int left=0;
        String res="";
        int reslen=Integer.MAX_VALUE;
        for(int right=0;right<slen;right++)
        {
            char currchar=s.charAt(right);
            hms.put(currchar,hms.getOrDefault(currchar,0)+1);
            if(hmt.containsKey(currchar)&&hmt.get(currchar).intValue()==hms.get(currchar).intValue())
            {
                have++;
            }
            while(have==need)
            {
                //have and need are equal then 1st update with minlen and minstring
                if(right-left+1<reslen)
                {
                    reslen=right-left+1;
                    res=s.substring(left,right+1);
                }
                //pop from the left of our window i.e is slide
                char windowfirstchar=s.charAt(left);
                hms.put(windowfirstchar,hms.get(windowfirstchar)-1);
                if(hmt.containsKey(windowfirstchar)&&hms.get(windowfirstchar)<hmt.get(windowfirstchar))
                {
                    have--;
                }
                left++;
            }
        }
        return res;
    }
}