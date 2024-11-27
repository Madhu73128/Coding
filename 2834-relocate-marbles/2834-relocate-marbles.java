class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        //List<Integer> al=new ArrayList<>(hs);
        int m=moveFrom.length;
        for(int i=0;i<m;i++)
        {
            int mf=moveFrom[i];
            int mt=moveTo[i];
            /*for(int j=0;j<al.size();j++)
            {
                if(al.get(j)==mf)
                {
                    al.set(j,mt);
                }
                //Collections.sort(al);
            }*/
            hs.remove(mf);
            hs.add(mt);
        }
        /*hs.clear();
        hs.addAll(al);
        al.clear();
        al.addAll(hs);
        Collections.sort(al);
        return al;*/
        List<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        return al;
    }
}