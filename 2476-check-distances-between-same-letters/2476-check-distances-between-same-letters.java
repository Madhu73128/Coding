class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        for(int curr_idx=0;curr_idx<n;curr_idx++)
        {
            char ch=s.charAt(curr_idx);
            if(hm.containsKey(ch))
            {
                int prev_idx=hm.get(ch);
                int diff=curr_idx-prev_idx-1;
                if(diff!=distance[ch-'a'])
                return false;
            }
            else
            {
                hm.put(ch,curr_idx);
            }
        }
        return true;
    }
}