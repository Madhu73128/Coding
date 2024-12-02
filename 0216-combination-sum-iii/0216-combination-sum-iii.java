class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        cs(k,n,1,al,res);
        return res;
    }
    public static void cs(int k,int target,int start,List<Integer> al,List<List<Integer>> res)
    {
        if(target==0&&al.size()==k)
        {
            res.add(new ArrayList<>(al));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            if(i<=target)
            {
                al.add(i);
                cs(k,target-i,i+1,al,res);
                al.remove(al.size()-1);
            }
        }
    }
}