class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        TreeSet<Integer> ts=new TreeSet<>();
        for(int num:nums)
        {
            ts.add(num);
        }
        ArrayList<Integer> al=new ArrayList<>(ts);
        Collections.sort(al);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++)
        {
            int min=al.get(i);
            int max=n-1+min;
            int index=Collections.binarySearch(al,max);
            if(index<0)
            {
                index=-(index+1);
            }
            else
            {
                index+=1;
            }
            int correctpositions=index-i;
            ans=Math.min(ans,n-correctpositions);
        }
        return ans;
    }
}