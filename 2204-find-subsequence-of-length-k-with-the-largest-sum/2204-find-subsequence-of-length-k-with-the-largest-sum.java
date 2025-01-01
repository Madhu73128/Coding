class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=nums[i];
        }
        Arrays.sort(temp);

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=n-k;i<n;i++)
        {
           hm.put(temp[i],hm.getOrDefault(temp[i],0)+1);
        }

        int res[]=new int[k];
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i])&&hm.get(nums[i])>0)
            {
                res[idx++]=nums[i];
                hm.put(nums[i],hm.get(nums[i])-1);
            }
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=ac-nuvibUls