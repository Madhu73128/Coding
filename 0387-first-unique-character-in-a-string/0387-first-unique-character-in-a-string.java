class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch)&&hm.get(ch)==1)
            {
                return i;
            }
        }
        return -1;
    }
    //or use Hashed Array of 26
}
//or
// public int firstUniqChar(String s) 
//{
    // int index = -1;
    // for(char ch : s.toCharArray()) {
    //     if(s.indexOf(ch) == s.lastIndexOf(ch)) {
    //         return s.indexOf(ch);
    //     }
    // }

    // return index;
//}