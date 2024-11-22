class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> subal=new ArrayList<>();
            al.addAll(func(nums[i],subal));
        }
        int res[]=new int[al.size()];
        int idx=0;
        for(int val:al)
        {
            res[idx++]=val;
        }
        return res;
    }
    public static ArrayList<Integer> func(int number,ArrayList<Integer> subal)
    {
        while(number!=0)//number>0
        {
            int rem=number%10;
            subal.add(rem);
            number/=10;
        }
        Collections.reverse(subal);
        return subal;
    }
}