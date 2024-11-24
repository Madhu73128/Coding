class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        TreeSet<Integer> ts=new TreeSet<>();
        for(int num:nums)
        {
            ts.add(num);
        }
        ArrayList<Integer> al=new ArrayList<>(ts);
        //Collections.sort(al);//ts is already sorted
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++)
        {
            int min=al.get(i);
            int max=n-1+min;
            int index=Collections.binarySearch(al,max);
            if(index<0)//may be index is -5 or -4 or anything for suppose if we have to insert at 4th position (0 based index) then func return (-4-1)=-5 then it turn into 4 using below
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