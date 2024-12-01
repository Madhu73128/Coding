class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        cs(candidates,target,0,al,res);
        /*HashSet<List<Integer>> hs=new HashSet<>();
        hs.addAll(res);
        res.clear();
        res.addAll(hs);*/
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
            if(i>start&&nums[i]==nums[i-1])
            continue;// Skip duplicates: if the current number is the same as the previous number, skip it
            if(nums[i]<=target)
            {
                al.add(nums[i]);
                cs(nums,target-nums[i],i+1,al,res);//i+1 becoz to prevent reusing the same element
                al.remove(al.size()-1);
            }
        }
    }
}