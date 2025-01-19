class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> al=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                al.add(i);
            }
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<al.size();j++)
            {
                min=Math.min(min,Math.abs(al.get(j)-i));
            }
            res[i]=min;
        }
        return res;
    }
}