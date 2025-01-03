class Solution {
    public int maxDistance(int[] colors) {
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        int n=colors.length;
        for(int i=0,j=n-1;i<n&&j>=0;i++,j--)
        {
            hm1.putIfAbsent(colors[i],i);
            hm2.putIfAbsent(colors[j],j);
        }
        int res=0;
        for(int key1:hm1.keySet())
        {
            for(int key2:hm2.keySet())
            {
                if(key1!=key2)
                {
                    res=Math.max(res,hm2.get(key2)-hm1.get(key1));
                }
            }
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=qiqrOAKkRzc