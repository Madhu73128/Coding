class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        cs(candidates,target,0,al,res);//backtracking
        return res;
    }
    public static void cs(int nums[],int target,int start,List<Integer> al,List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(al));
            return;
        }
        int n=nums.length;
        for(int i=start;i<n;i++)
        {
            if(nums[i]<=target)
            {
                al.add(nums[i]);//include
                cs(nums,target-nums[i],i,al,res);//recursive
                al.remove(al.size()-1);//backtrack
            }
        }
    }
}