class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm=new HashMap<>();
        int n=list1.length;
        for(int i=0;i<n;i++)
        {
            hm.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        int m=list2.length;
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            if(hm.containsKey(list2[i]))
            {
                int currval=i+hm.get(list2[i]);
                if(min>currval)
                {
                    min=currval;
                    al.clear();
                    al.add(list2[i]);
                }
                else if(min==currval)
                {
                    al.add(list2[i]);
                }
            }
        }
        return al.toArray(new String[0]);
    }
}