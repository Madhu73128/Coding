class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int res=0;
        int hash[]=new int[26];
        Arrays.fill(hash,0);
        int maxcharfrequency=0;
        int left=0;
        for(int right=0;right<n;right++)
        {
            hash[s.charAt(right)-'A']++;
            maxcharfrequency=Math.max(maxcharfrequency,hash[s.charAt(right)-'A']);
            int substringlen=right-left+1;
            int change=substringlen-maxcharfrequency;
            if(change>k)
            {
                hash[s.charAt(left)-'A']--;
                left++;
            }
            res=Math.max(res,right-left+1);//dont use substringlen as left gets updated
        }
        return res;
    }
}